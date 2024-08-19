package com.automation.pages;

import com.automation.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignInPage extends BasePage{

    @FindBy(xpath = "//div[@class='j-text j-text-heading-xs']")
    WebElement signInText;

    @FindBy(xpath = "//div[@class='signup_cardView__at_l4']/button")
    WebElement verifyButton;

    @FindBy(id = "phoneNumber")
    WebElement phoneNumberFiled;

    @FindBy(xpath = "//button")
    WebElement continueButton;



    public boolean verifySignInPageIsDisplayed() {
        return signInText.isDisplayed() && phoneNumberFiled.isDisplayed();
    }

    public void enterMobileNumber(String mobileNumber) {
        phoneNumberFiled.sendKeys(mobileNumber);
    }

    public void clickOnContinueButton() {
        continueButton.click();
    }

    public void enterOtpAndClickOnVerifyButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
//        String str = verifyButton.getAttribute("disabled");
//        System.out.println(str);
//        while (str.equals("true")){
//            Thread.sleep(500);
//            verifyButton = driver.findElement(By.xpath("//div[@class='signup_cardView__at_l4']/button"));
//            str = verifyButton.getAttribute("disabled");
//        }
//        wait.until(ExpectedConditions.attributeContains(verifyButton,"disabled","false"));
        wait.until(ExpectedConditions.visibilityOf(verifyButton));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",verifyButton);
    }
}
