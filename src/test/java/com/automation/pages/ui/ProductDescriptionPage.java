package com.automation.pages.ui;

public interface ProductDescriptionPage {
    String productName = "";

    boolean verifyProductDescriptionPageIsDisplayed();

    void clickOnAddToCart();

    void clickOnWishListIcon();

    String verifyProductAddedToWishList();

    void userUpdatesTheLocation();

    void clickOnWriteAReviewButton();

    String verifyReviewRatingPopupIsDisplayed();
}
