package com.automation.steps;

import com.automation.pages.mobile.RegisterPageMobile;
import com.automation.pages.ui.RegisterPage;
import com.automation.pages.web.RegisterPageWeb;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegisterSteps {

    RegisterPage registerPage;
    public RegisterSteps(){
        String environment = ConfigReader.getConfigValue("application.type");
        if(environment.equals("mobile")) {
            registerPage= new RegisterPageMobile();
        }else{
            registerPage = new RegisterPageWeb();
        }
    }

    @When("user enters valid register data")
    public void userEntersValidRegisterData() {
        registerPage.userEntersValidRegisterData();
    }

    @Then("verify user is on register page")
    public void verifyUserIsOnRegisterPage() {
        Assert.assertEquals("Setup your account",registerPage.verifyRegisterPageIsDisplayed());
    }


}
