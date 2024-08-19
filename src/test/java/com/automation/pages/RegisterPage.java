package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage extends BasePage{

    @FindBy(xpath = "//input[@name='firstname']")
    WebElement firstNameInputField;

    @FindBy(name = "lastname")
    WebElement lastNameInputField;

    @FindBy(id = "basic-input")
    WebElement emailInputField;

    @FindBy(xpath = "//input[@data-testid='data-dob']")
    WebElement dobInputField;

    @FindBy(xpath = "//div[@class='j-listBlock__children']//button[contains(@class,'j-DatePicker__selector-trigger')][2]")
    WebElement yearField;

    @FindBy(xpath = "//div[@class='j-listBlock__children']//button[contains(@class,'j-DatePicker__selector-trigger')][1]")
    WebElement monthField;

    @FindBy(xpath = "//div[@class='j-text j-text-heading-xs']")
    WebElement setUpAccountText;

    public void userEntersValidRegisterData() {
        firstNameInputField.sendKeys(ConfigReader.getConfigValue("valid.firstName"));
        lastNameInputField.sendKeys(ConfigReader.getConfigValue("valid.lastName"));
        driver.findElement(By.xpath("//input[@value='" + ConfigReader.getConfigValue("valid.gender") + "']")).click();
        emailInputField.sendKeys(ConfigReader.getConfigValue("valid.email"));
        dobInputField.click();
        yearField.click();
        driver.findElement(By.xpath("//button[contains(@class,'j-DatePicker__selection-year')]//div[text()='" + ConfigReader.getConfigValue("valid.year") + "']")).click();
        monthField.click();
        driver.findElement(By.xpath("//button[contains(@class,'j-DatePicker__selection-month')]//div[text()='" + ConfigReader.getConfigValue("valid.month") + "']")).click();
        driver.findElement(By.xpath("//button[@class='j-button j-button-size__medium tertiary']//div[text()='" + ConfigReader.getConfigValue("valid.date") + "']")).click();
    }

    public String verifyRegisterPageIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
        wait.until(ExpectedConditions.visibilityOf(setUpAccountText));
        System.out.println(setUpAccountText.getText());
        return setUpAccountText.getText();
    }
}
