package com.automation.steps;

import com.automation.pages.ProductsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductsSteps {
    ProductsPage productPage = new ProductsPage();

    @Then("verify user is redirected to the {string} products page")
    public void verifyUserIsRedirectedToTheProductsPage(String productName) {
        Assert.assertTrue(productPage.verifyMobileProductPageIsDisplayed().contains(productName));
    }

    @When("user clicks on first product")
    public void userClicksOnFirstProduct() {
        productPage.userClicksOnFirstProduct();
    }

    @Then("verify selected type of products are displayed")
    public void verifySelectedTypeOfProductsAreDisplayed() {
    }
}
