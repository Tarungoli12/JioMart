package com.automation.pages.mobile;

import com.automation.pages.ui.SignInPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPageMobile extends BasePageMobile implements SignInPage {

    @FindBy(xpath = "//android.widget.TextView[@text='Sign in']")
    WebElement signInText;

    @FindBy(xpath = "//android.widget.EditText")
    WebElement mobileNoFiled;

    @FindBy(xpath = "//android.widget.Button[@text='button Continue']")
    WebElement continueBtn;

    @Override
    public boolean verifySignInPageIsDisplayed() {
        waitForElementToBeVisible(signInText);
        return signInText.isDisplayed();
    }

    @Override
    public void enterMobileNumber(String mobileNumber) {
        mobileNoFiled.sendKeys(mobileNumber);
    }

    @Override
    public void clickOnContinueButton() {
        continueBtn.click();
    }

    @Override
    public void enterOtpAndClickOnVerifyButton() {

    }
}
