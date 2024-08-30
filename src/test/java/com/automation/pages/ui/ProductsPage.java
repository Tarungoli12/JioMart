package com.automation.pages.ui;

public interface ProductsPage {

    String verifyMobileProductPageIsDisplayed();

    void userClicksOnFirstProduct();

    boolean validateSearchedProducts();

    void userPerformSorting(String sortType);

    void userSpecifiesRange(String price);

    void clickOnOutOfStockButton();

    boolean verifyOutOfStockProductsAreDisplayed();

    void userScrollsDownAndClicksOnBrandFilter();

    boolean verifyDifferentBrandsAreDisplayed();

    void userSelectsBrand(String brandName);

    boolean verifyAllProductsAreFromSameBrand(String brandName);
}
