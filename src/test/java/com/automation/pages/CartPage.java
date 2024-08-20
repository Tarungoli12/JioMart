package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(xpath = "//div[@class='product-details']//div[contains(@class,'product-name')]")
    WebElement productNameInCart;

    @FindBy(xpath = "//button[@name='placeorder'][1]")
    WebElement placeOrderBtn;

    public String verifyProductSuccessfullyAddedInToCart() {
        return productNameInCart.getText();
    }

    public void userClicksOnPlaceOrderButton() {
        placeOrderBtn.click();
    }
}
