package com.automation.steps;

import com.automation.pages.SignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SignInSteps {

    SignInPage signInPage = new SignInPage();

    @Then("verify user is on sign in page")
    public void verifyUserIsOnSignInPage() {
        Assert.assertTrue(signInPage.verifySignInPageIsDisplayed());
    }

    @When("user enters mobile number {string}")
    public void userEntersMobileNumber(String mobileNumber) {
        signInPage.enterMobileNumber(mobileNumber);
    }

    @And("click on continue button")
    public void clickOnContinueButton() {
        signInPage.clickOnContinueButton();
    }

    @And("user enters otp and click on verify button")
    public void userEntersOtpAndClickOnVerifyButton() {
        signInPage.enterOtpAndClickOnVerifyButton();
    }


}
