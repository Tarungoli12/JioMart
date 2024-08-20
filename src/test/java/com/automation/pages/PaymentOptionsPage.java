package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentOptionsPage extends BasePage{

    @FindBy(xpath = "//div[text()='UPI']")
    WebElement upiBtn;

    @FindBy(xpath = "//div[text()='Netbanking']")
    WebElement netBankingBtn;

    public boolean verifyUserIsOnPaymentOptionsPage() {
        return upiBtn.isDisplayed() && netBankingBtn.isDisplayed();
    }
}
