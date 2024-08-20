package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductsPage extends BasePage{


    @FindBy(id = "current_sort")
    WebElement sortButton;

    @FindBy(xpath = "//div[@class='plp-card-details-price']/span[contains(@class,'heading')]")
    List<WebElement> listOfProductPrices;

    @FindBy(xpath = "//div[@class='search-list-buttons']/a")
    List<WebElement> searchedProductNames;

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

    List<Double> nonFilterPrices;
    List<Double> filterPrices;

    public void userPerformSorting(String sortingType) throws InterruptedException {
        sortButton.click();
        driver.findElement(By.xpath("//div[contains(text(),'"+ sortingType +"')]")).click();
        Thread.sleep(2000);
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

    public boolean validateSearchedProducts() {
        int k = 0;
        int j = 0;
        String[] names = ConfigReader.getConfigValue("search.value").split(",");
        for(int i=1;i<=searchedProductNames.size();i++){
            searchedProductNames.get(i).click();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(searchedProductNames.get(i).getText().contains(names[j])){
                k++;
            }
            j++;
        }
        return k == names.length;
    }

}
