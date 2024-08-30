package com.automation.pages.ui;

public interface CartPage {

    String verifyProductSuccessfullyAddedInToCart();

    void clickOnCartIcon();

    String verifyProductIsRemovedFromCart();

    void userClicksOnRemoveButton();

    void userClicksOnPlaceOrderButton();

    boolean validatingTheCartPriceIsMatchingWithCalculatedPrice();

}
