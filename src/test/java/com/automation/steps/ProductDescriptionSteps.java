package com.automation.steps;

import com.automation.pages.ProductDescriptionPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductDescriptionSteps {

    ProductDescriptionPage productDescriptionPage = new ProductDescriptionPage();

    @Then("verify user is on product description page")
    public void verifyUserIsOnProductDescriptionPage() {
        Assert.assertTrue(productDescriptionPage.verifyProductDescriptionPageIsDisplayed());
    }

    @When("user clicks on add to cart button")
    public void userClicksOnAddToCartButton() {
        productDescriptionPage.clickOnAddToCart();

    }
}
