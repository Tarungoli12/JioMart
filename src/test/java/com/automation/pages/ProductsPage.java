package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{

    @FindBy(xpath = "//div[@class='plp-card-details-tag']/following-sibling::div[contains(@class,'plp-card-details-name')]")
    WebElement firstProductName;

    @FindBy(xpath = "//li[@class='ais-InfiniteHits-item jm-col-4 jm-mt-base'][1]/a")
    WebElement firstProductLink;


    public String verifyMobileProductPageIsDisplayed() {
        return firstProductName.getText();
    }

    public void userClicksOnFirstProduct() {
        firstProductLink.click();
    }
}
