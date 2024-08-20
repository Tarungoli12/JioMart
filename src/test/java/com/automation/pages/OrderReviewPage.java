package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderReviewPage extends BasePage {

    @FindBy(xpath = "//div[@class='j-text sp--m pd--vertical j-text-heading-xs ng-star-inserted']")
    WebElement orderReviewTitle;

    @FindBy(xpath = "//div[@class='innercol ng-star-inserted']//button")
    WebElement newAddressIcon;

    @FindBy(xpath = "//button[@aria-label='button Add New Address']")
    WebElement addNewAddressBtn;

    @FindBy(xpath = "//div[@class='ng-star-inserted']//div[text()='Type your Address']")
    WebElement typeYourAddressBtn;

    @FindBy(xpath = "//input[@id='m_pin']")
    WebElement pinCodeInputField;

    @FindBy(xpath = "//input[@id='m_building_address']")
    WebElement addressInputField;

    @FindBy(xpath = "//input[@id='m_areaname']")
    WebElement areaInputField;

    @FindBy(xpath = "//button//div[text()=' Save & Proceed ']")
    WebElement saveAndProceedBtn;

    @FindBy(xpath = "//div[@class='place-order ng-star-inserted']//div[@class='ng-star-inserted'][normalize-space()='Make Payment']")
    WebElement makePaymentBtn;

    public String verifyUserIsOnOrderReviewPage() {
        return orderReviewTitle.getText();
    }

    public void userEntersValidAddress() {
        jsClick(newAddressIcon);
        jsClick(addNewAddressBtn);
        typeYourAddressBtn.click();
        pinCodeInputField.sendKeys(ConfigReader.getConfigValue("valid.pinCode"));
        addressInputField.sendKeys(ConfigReader.getConfigValue("valid.address"));
        areaInputField.sendKeys(ConfigReader.getConfigValue("valid.area"));
        driver.findElement(By.xpath("//label[text()='" + ConfigReader.getConfigValue("valid.addressType") + "']")).click();
        jsClick(saveAndProceedBtn);
    }

    public void clickOnMakePaymentButton() {
        jsClick(makePaymentBtn);
    }
}
