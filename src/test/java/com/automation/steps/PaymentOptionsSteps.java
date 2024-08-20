package com.automation.steps;

import com.automation.pages.PaymentOptionsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class PaymentOptionsSteps {

    PaymentOptionsPage paymentOptionsPage = new PaymentOptionsPage();

    @Then("verify user is on payment options page")
    public void verifyUserIsOnPaymentOptionsPage() {
        Assert.assertTrue(paymentOptionsPage.verifyUserIsOnPaymentOptionsPage());
    }
}
