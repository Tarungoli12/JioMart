package com.automation.steps;

import com.automation.pages.CartPage;
import com.automation.pages.ProductDescriptionPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CartSteps {

    CartPage cartPage = new CartPage();

    @Then("verify product is added into cart successfully")
    public void verifyProductIsAddedIntoCartSuccessfully() {
        Assert.assertEquals(ProductDescriptionPage.productName,cartPage.verifyProductSuccessfullyAddedInToCart());
    }

    @When("user clicks on place order button")
    public void userClicksOnPlaceOrderButton() {
        cartPage.userClicksOnPlaceOrderButton();
    }


    @When("user clicks on remove button")
    public void userClicksOnRemoveButton() {
        cartPage.userClicksOnRemoveButton();
    }

    @Then("verify product is removed from cart successfully")
    public void verifyProductIsRemovedFromCartSuccessfully() {
        Assert.assertEquals("Your Cart is Empty!",cartPage.verifyProductIsRemovedFromCart());
    }

    @When("user clicks on cart icon")
    public void userClicksOnCartIcon() {
        cartPage.clickOnCartIcon();
    }

    @Then("verify cart contains correct products count and cart value")
    public void verifyCartContainsCorrectProductsCountAndCartValue() {
        Assert.assertTrue(cartPage.validatingTheCartPriceIsMatchingWithCalculatedPrice());
    }
}
