package com.automation.pages.mobile;

import com.automation.pages.ui.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageMobile extends BasePageMobile implements HomePage {

    @FindBy(xpath = "//android.widget.TextView[@text='Proceed']")
    WebElement proceedBtn;

    @FindBy(xpath = "//android.widget.Button[@text='While using the app']")
    WebElement locationBtn;

    @FindBy(xpath = "//android.widget.Button[@text='Allow']")
    WebElement allowBtn;

    @FindBy(xpath = "//android.view.View[@content-desc='Cart']/../following-sibling::android.view.View")
    WebElement profileIcon;


    @Override
    public void openWebsite() {
        waitForElementToBeVisible(proceedBtn);
        clickOnElementIfPresent(proceedBtn);
        waitForElementToBeVisible(locationBtn);
        clickOnElementIfPresent(locationBtn);
        waitForElementToBeVisible(allowBtn);
        clickOnElementIfPresent(allowBtn);
        waitForElementToBeVisible(allowBtn);
        clickOnElementIfPresent(allowBtn);
    }

    @Override
    public boolean verifyJioMartHomePageIsDisplayed() {
        return profileIcon.isDisplayed();
    }

    @Override
    public void clickOnSignInButton() {
        profileIcon.click();
    }

    @Override
    public void clickOnHamburgerMenu() {

    }

    @Override
    public void enterProductsInItemList(String items) {

    }

    @Override
    public void clickOnSearchAllButton() {

    }

    @Override
    public void userSelectsProductsByCategoryAndSubCategory(String category, String subCategory, String specificProduct) {

    }

    @Override
    public String verifySpecificProductTypeOfProductsAreDisplayed() {
        return "";
    }

    @Override
    public void clickOnProfileButton() {

    }
}
