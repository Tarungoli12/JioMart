package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDescriptionPage extends BasePage{

    @FindBy(xpath = "//button[text()='Add to Cart']")
    WebElement addToCartButton;

    @FindBy(xpath = "//div[@class='jm-heading-xs jm-mb-base'][text()=' Description ']")
    WebElement descriptionText;

    @FindBy(xpath = "//button[contains(@class,'share_item')]")
    WebElement shareButton;

    @FindBy(id = "btn_minicart")
    WebElement cartIcon;

    @FindBy(xpath = "//div[@class='feedback-service-review-form-block']/button")
    WebElement reviewBtn;

    @FindBy(xpath = "//div[contains(@class,'modal-title ')]")
    WebElement rateAndReviewText;


    @FindBy(xpath = "//div[@class='jm-wishlist-btn large jm-mr-xs wishlist_btn']")
    WebElement wishListIcon;

    @FindBy(xpath = "//div[@class='jm-toast-content']//div[text()='Added to Wishlist']")
    WebElement wishListMsg;

    @FindBy(id = "btn_pin_code_delivery")
    WebElement deliveryPinCodeField;

    @FindBy(id ="btn_enter_pincode")
    WebElement enterPinCodeBtn;

    @FindBy(id = "rel_pincode")
    WebElement pinCodeInputField;

    @FindBy(id = "btn_pincode_submit")
    WebElement pinCodeApplyBtn;

    public static String productName;

    public boolean verifyProductDescriptionPageIsDisplayed() {
        productName = driver.findElement(By.id("pdp_product_name")).getText();
        return shareButton.isDisplayed();
    }

    public void clickOnAddToCart() {
        if(addToCartButton.isDisplayed())
        {
            jsClick(addToCartButton);
        }else {
            jsClick(cartIcon);
        }
    }

    public void clickOnWriteAReviewButton() {
        reviewBtn.click();
        reviewBtn.click();
    }

    public String verifyReviewRatingPopupIsDisplayed() {
        return rateAndReviewText.getText();
    }

    public void clickOnWishListIcon() {
        jsClick(wishListIcon);
    }

    public String verifyProductAddedToWishList() {
        return wishListMsg.getText();
    }

    public void userUpdatesTheLocation() {
        deliveryPinCodeField.click();
        enterPinCodeBtn.click();
        pinCodeInputField.sendKeys(ConfigReader.getConfigValue("valid.pinCode"));
        pinCodeApplyBtn.click();
    }
}
