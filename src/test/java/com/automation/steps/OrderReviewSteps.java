package com.automation.steps;

import com.automation.pages.OrderReviewPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class OrderReviewSteps {

    OrderReviewPage orderReviewPage = new OrderReviewPage();

    @Then("verify user is on order review page")
    public void verifyUserIsOnOrderReviewPage() {
        Assert.assertEquals("Order Review", orderReviewPage.verifyUserIsOnOrderReviewPage());
    }

    @When("user enters valid address")
    public void userEntersValidAddress() {
        orderReviewPage.userEntersValidAddress();
    }

    @And("clicks on make payment button")
    public void clicksOnMakePaymentButton() {
        orderReviewPage.clickOnMakePaymentButton();
    }
}
