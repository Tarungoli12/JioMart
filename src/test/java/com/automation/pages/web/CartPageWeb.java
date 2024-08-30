package com.automation.pages.web;

import com.automation.pages.ui.CartPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPageWeb extends BasePageWeb implements CartPage {

    @FindBy(xpath = "//div[@class='product-details']//div[contains(@class,'product-name')]")
    WebElement productNameInCart;

    @FindBy(xpath = "//button[@name='placeorder'][1]")
    WebElement placeOrderBtn;

    @FindBy(xpath = "//span[@aria-label='icon IcMinus']/../../..")
    WebElement removeBtn;

    @FindBy(xpath = "//div[text()='Your Cart is Empty!']")
    WebElement cartEmptyText;

    @FindBy(xpath = "//button[@aria-label='cart icon']")
    WebElement cartIcon;

    @FindBy(xpath = "//span[contains(@id,'row_itmdiscprice')]")
    List<WebElement> priceOfIndividualItem;

    @FindBy(xpath = "//span[@class='j-text flt-right j-text-heading-xxs ng-star-inserted']")
    WebElement totalCartPrice;

    public String verifyProductSuccessfullyAddedInToCart() {
        return productNameInCart.getText();
    }

    public void userClicksOnPlaceOrderButton() {
        placeOrderBtn.click();
    }

    public void userClicksOnRemoveButton() {
        removeBtn.click();
    }

    public String verifyProductIsRemovedFromCart() {
        return cartEmptyText.getText();
    }

    public void clickOnCartIcon() {
        jsClick(cartIcon);
    }

    public boolean validatingTheCartPriceIsMatchingWithCalculatedPrice() {

        double caluclatedTotalCartValue = 0;
        for (WebElement price : priceOfIndividualItem) {
            caluclatedTotalCartValue = caluclatedTotalCartValue + Double.parseDouble(price.getText().split("\\₹")[1]);
        }

        String totalCartValueTxt = totalCartPrice.getText().split("\\₹")[1];
        double totalCartValueOnWeb = Double.parseDouble(parsePrice(totalCartValueTxt));

        System.out.println("Price on Web===" + totalCartValueOnWeb);
        System.out.println("Price after calculation===" + caluclatedTotalCartValue);

        return totalCartValueOnWeb == caluclatedTotalCartValue;
    }

    public String parsePrice(String priceText) {
        // Remove commas
        priceText = priceText.replace(",", "");
        return priceText;
    }
}
