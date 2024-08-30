package com.automation.steps;

import com.automation.pages.mobile.OrderReviewPageMobile;
import com.automation.pages.ui.OrderReviewPage;
import com.automation.pages.web.OrderReviewPageWeb;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class OrderReviewSteps {

    OrderReviewPage orderReviewPage ;

    public OrderReviewSteps(){
        String environment = ConfigReader.getConfigValue("application.type");
        if(environment.equals("mobile")) {
            orderReviewPage = new OrderReviewPageMobile();
        }else{
            orderReviewPage = new OrderReviewPageWeb();
        }
    }

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
