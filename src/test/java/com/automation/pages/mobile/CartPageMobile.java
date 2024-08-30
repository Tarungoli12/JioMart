package com.automation.pages.mobile;

import com.automation.pages.ui.CartPage;

public class CartPageMobile extends BasePageMobile implements CartPage {

    @Override
    public String verifyProductSuccessfullyAddedInToCart() {
        return "";
    }

    @Override
    public void clickOnCartIcon() {

    }

    @Override
    public String verifyProductIsRemovedFromCart() {
        return "";
    }

    @Override
    public void userClicksOnRemoveButton() {

    }

    @Override
    public void userClicksOnPlaceOrderButton() {

    }

    @Override
    public boolean validatingTheCartPriceIsMatchingWithCalculatedPrice() {
        return false;
    }
}
