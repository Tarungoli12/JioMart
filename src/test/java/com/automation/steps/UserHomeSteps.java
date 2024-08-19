package com.automation.steps;

import com.automation.pages.UserHomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserHomeSteps {
    UserHomePage userHomePage = new UserHomePage();

    @Then("verify user is on user home page")
    public void verifyUserIsOnUserHomePage() {
        Assert.assertTrue(userHomePage.verifyUserHomePageDisplayed());
    }

    @When("user search for {string}")
    public void userSearchFor(String productName) {
        userHomePage.userSearchForProduct(productName);
    }

}
