package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.IosBrowserConstants;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class BrowserServices {

    public static String resultText = "";

    public static void avoidAd() {
        MobileActionManager.waitVisibility(IosBrowserConstants.GOOGLE_AD_LOCATOR);
        MobileActionManager.click(IosBrowserConstants.GOOGLE_AD_LOCATOR);
    }

    public static void searchText(String text) {
        MobileActionManager.click(IosBrowserConstants.BROWSER_INPUT_LOCATOR);
        MobileActionManager.setInput(IosBrowserConstants.BROWSER_INPUT_LOCATOR, text);
        MobileActionManager.getElement(IosBrowserConstants.BROWSER_INPUT_LOCATOR).sendKeys(Keys.ENTER);
        resultText = text;
    }

    public static void searchResultValidation() {
        switch (resultText) {
            case "Crowdar":
                String actualText1 = MobileActionManager.getText(IosBrowserConstants.RESULT_TEXT_LOCATOR, "XCUIElementTypeOther[15]/XCUIElementTypeStaticText");
                Assert.assertTrue(actualText1.contains(resultText), IosBrowserConstants.NO_RESULT_MESSAGE);
                break;

            case "Lippia.io":
                String actualText2 = MobileActionManager.getText(IosBrowserConstants.RESULT_TEXT_LOCATOR, "XCUIElementTypeLink[1]");
                Assert.assertTrue(actualText2.contains(resultText), IosBrowserConstants.NO_RESULT_MESSAGE);
                break;
        }

    }

}
