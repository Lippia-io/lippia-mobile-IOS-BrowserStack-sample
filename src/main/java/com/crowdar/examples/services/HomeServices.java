package com.crowdar.examples.services;

import com.crowdar.examples.constants.IosHomeConstants;
import com.crowdar.core.actions.MobileActionManager;
import org.testng.Assert;

public class HomeServices {
    public static String MainText = "";

    public static void isViewLoaded() {
        MobileActionManager.waitVisibility(IosHomeConstants.HOME_BUTTON_LOCATOR);
        MainText = MobileActionManager.getText(IosHomeConstants.SCREEN_TEXT_LOCATOR);
    }

    public static void tapButton(Integer times) {
        for (int i = 0; i < times; i++) {
            MobileActionManager.click(IosHomeConstants.TEXT_BUTTON_LOCATOR);
        }
    }

    public static void changedText(){
        Assert.assertNotEquals(MainText, MobileActionManager.getText(IosHomeConstants.SCREEN_TEXT_LOCATOR), IosHomeConstants.NO_CHANGES_MESSAGE);
    }


    public static void tapBrowserButton() {
        MobileActionManager.click(IosHomeConstants.BROWSER_BUTTON_LOCATOR);
    }
}
