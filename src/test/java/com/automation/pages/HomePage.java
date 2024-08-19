package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(id = "sign_in_text")
    WebElement signInBtn;

    @FindBy(id = "autocomplete-0-input")
    WebElement searchBar;

    public void openWebsite() {
        driver.get(ConfigReader.getConfigValue("base.url"));
    }

    public boolean verifyJioMartHomePageIsDisplayed() {
        return signInBtn.isDisplayed() && searchBar.isDisplayed();
    }

    public void clickOnSignInButton() {

        signInBtn.click();
    }

}
