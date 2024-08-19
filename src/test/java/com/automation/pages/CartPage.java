package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    @FindBy(xpath = "//div[@class='product-details']//div[contains(@class,'product-name')]")
    WebElement productNameInCart;

    @FindBy(xpath = "//jds-button[@icon='IcMinus']/button")
    WebElement removeButton;

    @FindBy(xpath = "//div[contains(@class,'emptycart-title')]")
    WebElement emptyCartText;

    public String verifyProductSuccessfullyAddedInToCart() {
        return productNameInCart.getText();
    }

    public void userClicksOnRemoveButton() {
        jsClick(removeButton);
    }

    public String verifyProductIsRemovedFromCart() {
        return emptyCartText.getText();
    }
}
