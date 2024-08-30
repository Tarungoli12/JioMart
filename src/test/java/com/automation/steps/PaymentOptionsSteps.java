package com.automation.steps;

import com.automation.pages.mobile.PaymentOptionsPageMobile;
import com.automation.pages.ui.PaymentOptionsPage;
import com.automation.pages.web.PaymentOptionsPageWeb;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class PaymentOptionsSteps {

    PaymentOptionsPage paymentOptionsPage;

    public PaymentOptionsSteps(){
        String environment = ConfigReader.getConfigValue("application.type");
        if(environment.equals("mobile")) {
            paymentOptionsPage= new PaymentOptionsPageMobile();
        }else{
            paymentOptionsPage = new PaymentOptionsPageWeb();
        }
    }

    @Then("verify user is on payment options page")
    public void verifyUserIsOnPaymentOptionsPage() {
        Assert.assertTrue(paymentOptionsPage.verifyUserIsOnPaymentOptionsPage());
    }
}
