package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

    public static String productName;

    public boolean verifyProductDescriptionPageIsDisplayed() {
        productName = driver.findElement(By.id("pdp_product_name")).getText();
        return addToCartButton.isDisplayed() && shareButton.isDisplayed();
    }

    public void clickOnAddToCart() {
        jsClick(addToCartButton);
    }

    public void clickOnCartIconButton() {
        cartIcon.click();
    }
}
