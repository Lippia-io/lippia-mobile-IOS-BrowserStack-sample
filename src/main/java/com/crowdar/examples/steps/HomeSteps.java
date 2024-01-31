package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.HomeServices;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class HomeSteps extends PageSteps {

    @Then("Home page is displayed")
    public void isHomePageVisible() {
        HomeServices.isViewLoaded();
    }
    

    @When("The user taps on Text button (.*) times")
    public void theUserTapsOnButton(String times) {
        HomeServices.tapButton(Integer.valueOf(times));

    }

    @Then("The text displayed is changed")
    public void theTextDisplayedIsChaged() {
        HomeServices.changedText();
    }

    @io.cucumber.java.en.When("The user taps on the browser button")
    public void theUserTapsOnTheBrowserButton() {
        HomeServices.tapBrowserButton();
    }
}
