package com.automation.pages.mobile;

import com.automation.pages.ui.ProductDescriptionPage;

public class ProductDescriptionPageMobile extends BasePageMobile implements ProductDescriptionPage {


    @Override
    public boolean verifyProductDescriptionPageIsDisplayed() {
        return false;
    }

    @Override
    public void clickOnAddToCart() {

    }

    @Override
    public void clickOnWishListIcon() {

    }

    @Override
    public String verifyProductAddedToWishList() {
        return "";
    }

    @Override
    public void userUpdatesTheLocation() {

    }

    @Override
    public void clickOnWriteAReviewButton() {

    }

    @Override
    public String verifyReviewRatingPopupIsDisplayed() {
        return "";
    }
}
