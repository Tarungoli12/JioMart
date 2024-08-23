package com.automation.steps;

import com.automation.pages.ProductsPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductsSteps {
    ProductsPage productsPage = new ProductsPage();

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
    public void userPerformsSorting(String sortType) throws InterruptedException {
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
}
