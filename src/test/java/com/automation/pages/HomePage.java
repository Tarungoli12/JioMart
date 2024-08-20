package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(id = "sign_in_text")
    WebElement signInBtn;

    @FindBy(id = "autocomplete-0-input")
    WebElement searchBar;

    @FindBy(xpath = "//section[@class='jm-breadcrumbs breadcrumbs-container']//li[5]/a")
    WebElement specificProductTypeTitle;

    public void openWebsite() {
        driver.get(ConfigReader.getConfigValue("base.url"));
    }

    public boolean verifyJioMartHomePageIsDisplayed() {
        return signInBtn.isDisplayed() && searchBar.isDisplayed();
    }

    public void clickOnSignInButton() {

        signInBtn.click();
    }

    public void userSelectsProductsByCategoryAndSubCategory(String category, String subCategory, String specificProduct) {
        Actions actions = new Actions(driver);

        WebElement categoryEle = driver.findElement(By.xpath("//a[text()='" + category + "']"));
        actions.moveToElement(categoryEle).pause(2000);

        WebElement subCategoryEle = driver.findElement(By.xpath("//a[text()='" + category + "']/following-sibling::div//a[text()='" + subCategory + "']"));
        actions.moveToElement(subCategoryEle).pause(2000);

        try {
            WebElement specificProductEle = driver.findElement(By.xpath("//a[text()='" + subCategory + "']/following-sibling::div//a[text()='" + specificProduct + "']"));
            actions.moveToElement(specificProductEle).pause(2000).click(specificProductEle).build().perform();
        }
        catch (Exception e){
            WebElement specificProductEle = driver.findElement(By.xpath("(//a[text()='" + subCategory + "']/following-sibling::div//a[text()='" + specificProduct + "'])[2]"));
            actions.moveToElement(specificProductEle).pause(2000).click(specificProductEle).build().perform();
        }
    }

    public String verifySpecificProductTypeOfProductsAreDisplayed() {
        System.out.println(specificProductTypeTitle.getText());
        return specificProductTypeTitle.getText();
    }
}
