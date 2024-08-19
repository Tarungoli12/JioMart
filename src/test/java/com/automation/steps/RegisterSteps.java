package com.automation.steps;

import com.automation.pages.RegisterPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegisterSteps {

    RegisterPage registerPage = new RegisterPage();

    @When("user enters valid register data")
    public void userEntersValidRegisterData() {
        registerPage.userEntersValidRegisterData();
    }

    @Then("verify user is on register page")
    public void verifyUserIsOnRegisterPage() {
        Assert.assertEquals("Setup your account",registerPage.verifyRegisterPageIsDisplayed());
    }


}
