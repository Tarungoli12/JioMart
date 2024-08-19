package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderReviewPage extends BasePage{

    @FindBy(xpath = "//div[@class='j-text sp--m pd--vertical j-text-heading-xs ng-star-inserted']")
    WebElement orderReviewTitle;

    @FindBy(xpath = "//div[@class='innercol ng-star-inserted']//button")
    WebElement newAddressIcon;

    @FindBy(xpath = "//button[@aria-label='button Add New Address']")
    WebElement addNewAddressBtn;

    public String verifyUserIsOnOrderReviewPage() {
        return orderReviewTitle.getText();
    }

    public void userEntersValidAddress() {
        newAddressIcon.click();
        addNewAddressBtn.click();
    }
}
