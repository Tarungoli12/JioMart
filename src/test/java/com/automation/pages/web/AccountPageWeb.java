package com.automation.pages.web;

import com.automation.pages.ui.AccountPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPageWeb extends BasePageWeb implements AccountPage {

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
