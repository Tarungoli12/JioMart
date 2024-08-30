package com.automation.steps;

import com.automation.pages.mobile.ProductsPageMobile;
import com.automation.pages.ui.ProductsPage;
import com.automation.pages.web.ProductsPageWeb;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductsSteps {
    ProductsPage productsPage;
    public ProductsSteps(){
        String environment = ConfigReader.getConfigValue("application.type");
        if(environment.equals("mobile")) {
            productsPage= new ProductsPageMobile();
        }else{
            productsPage = new ProductsPageWeb();
        }
    }

    @Then("verify user is redirected to the {string} products page")
    public void verifyUserIsRedirectedToTheProductsPage(String productName) {
        Assert.assertTrue(productsPage.verifyMobileProductPageIsDisplayed().contains(productName));
    }

    @When("user clicks on first product")
    public void userClicksOnFirstProduct() {
        productsPage.userClicksOnFirstProduct();
    }

    @Then("verify selected type of products are displayed")
    public void verifySelectedTypeOfProductsAreDisplayed() {
    }

    @Then("validate the searched products are displayed in items page")
    public void validateTheSearchedProductsAreDisplayedInItemsPage() {
        Assert.assertTrue(productsPage.validateSearchedProducts());
    }

    @When("user performs sorting {string}")
    public void userPerformsSorting(String sortType){
        productsPage.userPerformSorting(sortType);
    }

    @When("user specifies price range {string}")
    public void userSpecifiesPriceRange(String price) {
        productsPage.userSpecifiesRange(price);
    }

    @When("user clicks on include out of stock button")
    public void userClicksOnIncludeOutOfStockButton() {
        productsPage.clickOnOutOfStockButton();
    }

    @Then("verify out of stock products are displayed")
    public void verifyOutOfStockProductsAreDisplayed() {
        Assert.assertTrue(productsPage.verifyOutOfStockProductsAreDisplayed());
    }

    @When("user scrolls down and clicks on brand filter")
    public void userScrollsDownAndClicksOnBrandFilter() {
        productsPage.userScrollsDownAndClicksOnBrandFilter();
    }

    @Then("verify different brands are displayed")
    public void verifyDifferentBrandsAreDisplayed() {
        Assert.assertTrue(productsPage.verifyDifferentBrandsAreDisplayed());
    }

    @When("user selects brand {string}")
    public void userSelectsBrand(String brandName){
        productsPage.userSelectsBrand(brandName);
    }

    @Then("verify all products displayed are from the selected brand {string}")
    public void verifyAllProductsDisplayedAreFromTheSelectedBrand(String brandName){
        Assert.assertTrue(productsPage.verifyAllProductsAreFromSameBrand(brandName));
    }
}
