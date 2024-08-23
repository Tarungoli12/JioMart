package com.automation.steps;

import com.automation.pages.AccountPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountSteps {

    AccountPage accountPage = new AccountPage();

    @Then("verify user is redirected to the profile section page")
    public void verifyUserIsRedirectedToTheProfileSectionPage() {
        Assert.assertEquals("My Account",accountPage.verifyProfileSectionPageIsDisplayed());
    }

    @When("user clicks on sign out button")
    public void userClicksOnSignOutButton() {
        accountPage.clickOnSignOutButton();
    }
}
