package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Given("user opens jio mart website")
    public void userOpensJioMartWebsite() {
        homePage.openWebsite();
    }

    @Then("verify user is on jio mart home page")
    public void verifyUserIsOnJioMartHomePage() {
        Assert.assertTrue(homePage.verifyJioMartHomePageIsDisplayed());
    }

    @When("user clicks on sign in button")
    public void userClicksOnSignInButton() {
        homePage.clickOnSignInButton();
    }


}
