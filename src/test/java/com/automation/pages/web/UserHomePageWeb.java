package com.automation.pages.web;

import com.automation.pages.ui.UserHomePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserHomePageWeb extends BasePageWeb implements UserHomePage {

    @FindBy(xpath = "//button[text()='Agree']")
    WebElement agreeButton;

    @FindBy(id = "user_initial")
    WebElement userNameText;
    
    @FindBy(xpath = "//input[@class='aa-Input search_input']")
    WebElement searchBar;

    public boolean verifyUserHomePageDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(agreeButton));
        agreeButton.click();
        return userNameText.isDisplayed();
    }

    public void userSearchForProduct(String productName) {
        searchBar.sendKeys(productName);
        searchBar.sendKeys(Keys.ENTER);
    }

}
