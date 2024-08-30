package com.automation.steps;

import com.automation.pages.mobile.ProductDescriptionPageMobile;
import com.automation.pages.ui.ProductDescriptionPage;
import com.automation.pages.web.ProductDescriptionPageWeb;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductDescriptionSteps {

    ProductDescriptionPage productDescriptionPage ;
    public ProductDescriptionSteps(){
        String environment = ConfigReader.getConfigValue("application.type");
        if(environment.equals("mobile")) {
            productDescriptionPage= new ProductDescriptionPageMobile();
        }else{
            productDescriptionPage = new ProductDescriptionPageWeb();
        }
    }

    @Then("verify user is on product description page")
    public void verifyUserIsOnProductDescriptionPage() {
        Assert.assertTrue(productDescriptionPage.verifyProductDescriptionPageIsDisplayed());
    }

    @When("user clicks on add to cart button")
    public void userClicksOnAddToCartButton() {
        productDescriptionPage.clickOnAddToCart();
    }

    @When("user clicks on wish list icon")
    public void userClicksOnWishListIcon() {
        productDescriptionPage.clickOnWishListIcon();
    }

    @Then("verify product is added into wishlist successfully")
    public void verifyProductIsAddedIntoWishlistSuccessfully() {
        Assert.assertEquals(productDescriptionPage.verifyProductAddedToWishList(),"Added to Wishlist");
    }

    @When("user updates the location")
    public void userUpdatesTheLocation() {
        productDescriptionPage.userUpdatesTheLocation();
    }

    @When("user clicks on write a review")
    public void userClicksOnWriteAReview(){
        productDescriptionPage.clickOnWriteAReviewButton();
    }

    @Then("verify review rating popup is displayed")
    public void verifyReviewRatingPopupIsDisplayed() {
        Assert.assertEquals("Rate & Review",productDescriptionPage.verifyReviewRatingPopupIsDisplayed());
    }
}
