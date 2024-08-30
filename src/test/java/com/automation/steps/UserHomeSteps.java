package com.automation.steps;

import com.automation.pages.mobile.UserHomePageMobile;
import com.automation.pages.ui.UserHomePage;
import com.automation.pages.web.UserHomePageWeb;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserHomeSteps {
    UserHomePage userHomePage;
    public UserHomeSteps(){
        String environment = ConfigReader.getConfigValue("application.type");
        if(environment.equals("mobile")) {
            userHomePage= new UserHomePageMobile();
        }else{
            userHomePage = new UserHomePageWeb();
        }
    }

    @Then("verify user is on user home page")
    public void verifyUserIsOnUserHomePage() {
        Assert.assertTrue(userHomePage.verifyUserHomePageDisplayed());
    }

    @When("user search for {string}")
    public void userSearchFor(String productName) {
        userHomePage.userSearchForProduct(productName);
    }

}
