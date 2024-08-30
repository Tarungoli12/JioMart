package com.automation.pages.ui;

public interface HomePage {
    void openWebsite();

    boolean verifyJioMartHomePageIsDisplayed();

    void clickOnSignInButton();

    void clickOnHamburgerMenu();

    void enterProductsInItemList(String items);

    void clickOnSearchAllButton();

    void userSelectsProductsByCategoryAndSubCategory(String category, String subCategory, String specificProduct);

    String verifySpecificProductTypeOfProductsAreDisplayed();

    void clickOnProfileButton();
}
