package com.automation.pages.mobile;

import com.automation.pages.ui.UserHomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserHomePageMobile extends BasePageMobile implements UserHomePage {

    @FindBy(xpath = "(//android.widget.TextView[@text='My Account'])[2]")
    WebElement myAccountText;

    @Override
    public boolean verifyUserHomePageDisplayed() {
        waitForElementToBeVisible(myAccountText);
        return myAccountText.isDisplayed();
    }

    @Override
    public void userSearchForProduct(String productName) {
        
    }
}
