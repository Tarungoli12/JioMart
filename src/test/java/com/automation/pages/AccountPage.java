package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{

    @FindBy(xpath = "//h5[text()='My Account']")
    WebElement myAccountText;

    @FindBy(xpath = "//a[text()='Sign Out']")
    WebElement signOutBtn;

    @FindBy(xpath = "//button[@aria-label='button Sign Out']")
    WebElement signOutPopUpBtn;

    public String verifyProfileSectionPageIsDisplayed() {
        return myAccountText.getText();
    }

    public void clickOnSignOutButton() {
        signOutBtn.click();
        signOutPopUpBtn.click();
    }
}
