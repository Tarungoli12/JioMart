package com.automation.steps;

import com.automation.pages.mobile.HomePageMobile;
import com.automation.pages.ui.HomePage;
import com.automation.pages.web.HomePageWeb;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {

    HomePage homePage;

    public HomeSteps(){
        String environment = ConfigReader.getConfigValue("application.type");
        if(environment.equals("mobile")) {
            homePage = new HomePageMobile();
        }else{
            homePage = new HomePageWeb();
        }
    }


    @Given("user opens jio mart website")
    public void userOpensJioMartWebsite() {
        homePage.openWebsite();
    }

    @Then("verify user is on jio mart home page")
    public void verifyUserIsOnJioMartHomePage() {
        Assert.assertTrue(homePage.verifyJioMartHomePageIsDisplayed());
    }

    @When("user clicks on sign in button")
    public void userClicksOnSignInButton() {
        homePage.clickOnSignInButton();
    }

    @When("user clicks on hamburger menu")
    public void userClicksOnHamburgerMenu() {
        homePage.clickOnHamburgerMenu();
    }

    @And("enters product names separated by commas {string}")
    public void entersProductNamesSeparatedByCommas(String items) {
        homePage.enterProductsInItemList(items);
    }

    @And("clicks on search all button")
    public void clicksOnSearchAllButton() {
        homePage.clickOnSearchAllButton();
    }


    @When("user selects category type {string} and sub-category type {string} and specific-type {string}")
    public void userSelectsCategoryTypeAndSubCategoryTypeAndSpecificType(String category, String subCategory, String specificProduct) {
        homePage.userSelectsProductsByCategoryAndSubCategory(category, subCategory, specificProduct);
    }

    @Then("verify specific-product type {string} of products are displayed")
    public void verifySpecificProductTypeOfProductsAreDisplayed(String specificProductType) {
        System.out.println(specificProductType);
        Assert.assertEquals(specificProductType, homePage.verifySpecificProductTypeOfProductsAreDisplayed());
    }

    @When("user clicks on profile button")
    public void userClicksOnProfileButton() {
        homePage.clickOnProfileButton();
    }

}
