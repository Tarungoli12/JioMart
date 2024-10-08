package com.automation.pages.web;

import com.automation.pages.ui.ProductsPage;
import com.automation.utils.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductsPageWeb extends BasePageWeb implements ProductsPage {

    @FindBy(id = "current_sort")
    WebElement sortButton;

    @FindBy(xpath = "//div[@class='plp-card-details-price']/span[contains(@class,'heading')]")
    List<WebElement> listOfProductPrices;

    @FindBy(xpath = "//div[@class='search-list-buttons']/a")
    List<WebElement> searchedProductNames;

    @FindBy(xpath = "(//div[contains(@class,'plp-card-details')]/div[contains(@class,'plp-card-details-name')])[1]")
    WebElement firstProductName;

    @FindBy(xpath = "//li[@class='ais-InfiniteHits-item jm-col-4 jm-mt-base'][1]/a")
    WebElement firstProductLink;

    @FindBy(xpath = "//span[text()='Include Out of stock']")
    WebElement outOfStockBtn;

    @FindBy(xpath = "//span[@class='out-of-stock-label']")
    List<WebElement> outOfStockProducts;

    @FindBy(xpath = "//div[@id='brand_filter']//following-sibling::div//button")
    WebElement brandFilterBtn;

    @FindBy(xpath = "//div[text()='Select Brand']")
    WebElement selectBrandTitle;

    @FindBy(id = "filter_popup_search")
    WebElement searchBrandInputField;

    @FindBy(xpath = "//button[@id='filter_popup_apply']")
    WebElement applyBtn;

    public String verifyMobileProductPageIsDisplayed() {
        return firstProductName.getText();
    }

    public void userClicksOnFirstProduct() {
        jsClick(firstProductLink);
    }

    List<Double> nonFilterPrices;
    List<Double> filterPrices;

    public void userPerformSorting(String sortingType){
        sortButton.click();
        driver.findElement(By.xpath("//div[contains(text(),'"+ sortingType +"')]")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        nonFilterPrices = giveInDouble(driver.findElements(By.xpath("//div[@class='plp-card-details-price']/span[contains(@class,'heading')]")));
        filterPrices = new ArrayList<>(nonFilterPrices);
        Collections.sort(filterPrices);
        if(sortingType.equals("Price: High to Low")) Collections.reverse(nonFilterPrices);
        System.out.println(nonFilterPrices);
        System.out.println(filterPrices);
        Assert.assertEquals(nonFilterPrices,filterPrices);
    }

    public List<Double> giveInDouble(List<WebElement> elements){
        return new ArrayList<>(elements.stream().map(WebElement::getText).map(s ->
                s.replace("₹", "").replace(",", "")).map(Double::parseDouble).toList());
    }

    boolean flag;
    public boolean validateSearchedProducts() {
        int k = 0;
        String[] names = ConfigReader.getConfigValue("search.value").split(",");
        for(int i=0;i<searchedProductNames.size();i++){
            searchedProductNames.get(i).click();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(searchedProductNames.get(0).getText().equals(names[i])){
                k++;
            }
            String firstProdName = driver.findElement(By.xpath("(//div[@class='plp-card-details-container']/div)[1]")).getText();
            if(firstProdName.contains(names[i])){
                flag = true;
            }
        }
        System.out.println(k);
        return k == names.length && flag;
    }

    public void userSpecifiesRange(String price) {
        String pointerXpath = "//h2[text()='Price']/../following-sibling::div//div[@aria-label='Maximum Filter Handle']";
        int priceMove = Integer.parseInt(price);
        scrollFilterSelector(pointerXpath,priceMove);
    }

    public void clickOnOutOfStockButton() {
        outOfStockBtn.click();
    }

    public boolean verifyOutOfStockProductsAreDisplayed() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (WebElement prod : outOfStockProducts){
            if(prod.getText().contains("Out of Stock")){
                return true;
            }
        }
        return false;
    }
    public void userScrollsDownAndClicksOnBrandFilter() {
        brandFilterBtn.click();
    }

    public boolean verifyDifferentBrandsAreDisplayed() {
        return selectBrandTitle.isDisplayed();
    }

    public void userSelectsBrand(String brandName){
        searchBrandInputField.sendKeys(brandName);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement brandCheckboxField = driver.findElement(By.xpath("//input[@value='" + brandName + "']"));
        jsClick(brandCheckboxField);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        applyBtn.click();
    }

    List<WebElement> productNames = new ArrayList<>();
    boolean flag1;

    public boolean verifyAllProductsAreFromSameBrand(String brandName) {
        productNames = driver.findElements(By.xpath("//div[contains(@class,'plp-card-details-name')]"));
        for(int i=0;i<productNames.size();i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            String productName = driver.findElement(By.xpath("(//div[contains(@class,'plp-card-details-name')])[" + (i+1) + "]")).getText();
            flag1 = productName.contains(brandName);
            System.out.println(productName);
        }
        return flag1;
    }
}
