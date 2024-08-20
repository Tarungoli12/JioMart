package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserHomePage extends BasePage{

    @FindBy(xpath = "//button[text()='Agree']")
    WebElement agreeButton;

    @FindBy(id = "user_initial")
    WebElement userNameText;

    @FindBy(xpath = "//input[@placeholder='Search JioMart']")
    WebElement searchBar;

    public boolean verifyUserHomePageDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(agreeButton));
        agreeButton.click();
        return userNameText.isDisplayed();
    }

    public void userSearchForProduct(String productName) {
        searchBar.sendKeys(ConfigReader.getConfigValue(productName));
        searchBar.sendKeys(Keys.ENTER);
    }
}
