package com.automation.pages.mobile;

import com.automation.pages.ui.ProductsPage;

public class ProductsPageMobile extends BasePageMobile implements ProductsPage {

    @Override
    public String verifyMobileProductPageIsDisplayed() {
        return "";
    }

    @Override
    public void userClicksOnFirstProduct() {

    }

    @Override
    public boolean validateSearchedProducts() {
        return false;
    }

    @Override
    public void userPerformSorting(String sortType) {

    }

    @Override
    public void userSpecifiesRange(String price) {

    }

    @Override
    public void clickOnOutOfStockButton() {

    }

    @Override
    public boolean verifyOutOfStockProductsAreDisplayed() {
        return false;
    }

    @Override
    public void userScrollsDownAndClicksOnBrandFilter() {

    }

    @Override
    public boolean verifyDifferentBrandsAreDisplayed() {
        return false;
    }

    @Override
    public void userSelectsBrand(String brandName) {

    }

    @Override
    public boolean verifyAllProductsAreFromSameBrand(String brandName) {
        return false;
    }
}
