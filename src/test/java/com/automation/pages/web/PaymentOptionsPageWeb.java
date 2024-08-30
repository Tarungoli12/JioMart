package com.automation.pages.web;

import com.automation.pages.ui.PaymentOptionsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentOptionsPageWeb extends BasePageWeb implements PaymentOptionsPage {

    @FindBy(xpath = "//div[text()='UPI']")
    WebElement upiBtn;

    @FindBy(xpath = "//div[text()='Netbanking']")
    WebElement netBankingBtn;

    public boolean verifyUserIsOnPaymentOptionsPage() {
        return upiBtn.isDisplayed() && netBankingBtn.isDisplayed();
    }
}
