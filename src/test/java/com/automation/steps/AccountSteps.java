package com.automation.steps;

import com.automation.pages.mobile.AccountPageMobile;
import com.automation.pages.ui.AccountPage;
import com.automation.pages.web.AccountPageWeb;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountSteps {

    AccountPage accountPage;

    public AccountSteps() {
        String environment = ConfigReader.getConfigValue("application.type");
        if (environment.equals("mobile")) {
            accountPage = new AccountPageMobile();
        } else {
            accountPage = new AccountPageWeb();
        }
    }

    @Then("verify user is redirected to the profile section page")
    public void verifyUserIsRedirectedToTheProfileSectionPage() {
        Assert.assertEquals("My Account", accountPage.verifyProfileSectionPageIsDisplayed());
    }

    @When("user clicks on sign out button")
    public void userClicksOnSignOutButton() {
        accountPage.clickOnSignOutButton();
    }

}
