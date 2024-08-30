package com.automation.steps;

import com.automation.pages.mobile.SignInPageMobile;
import com.automation.pages.ui.SignInPage;
import com.automation.pages.web.SignInPageWeb;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SignInSteps {

    SignInPage signInPage;
    public SignInSteps(){
        String environment = ConfigReader.getConfigValue("application.type");
        if(environment.equals("mobile")) {
            signInPage= new SignInPageMobile();
        }else{
            signInPage = new SignInPageWeb();
        }
    }

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
