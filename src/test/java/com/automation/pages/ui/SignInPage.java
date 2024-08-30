package com.automation.pages.ui;

public interface SignInPage {
    boolean verifySignInPageIsDisplayed();

    void enterMobileNumber(String mobileNumber);

    void clickOnContinueButton();

    void enterOtpAndClickOnVerifyButton();
}
