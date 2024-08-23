package com.automation.pages;

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
}
