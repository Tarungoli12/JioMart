package com.automation.pages.web;

import com.automation.pages.ui.BasePage;
import com.automation.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BasePageWeb implements BasePage {
    WebDriver driver;
    JavascriptExecutor js;
    Actions actions;

    public BasePageWeb() {
        this.driver = DriverManager.getDriver();
        js = (JavascriptExecutor) driver;
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public void jsClick(WebElement element) {
        js.executeScript("arguments[0].click();", element);
    }

    public void scrollFilterSelector(String xpath, int price) {
        WebElement pointer = driver.findElement(By.xpath(xpath));
        long slideAmount = Long.parseLong(pointer.findElement(By.xpath("./div")).getText());
        int slideMove = -5;
        boolean flag = false;
        while (price != slideAmount) {

            if(slideAmount < price) {
                flag = true;
                slideMove = (-slideMove)+1;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            if(slideMove > price){
                if(flag) slideMove  = -(slideMove);
            }
//            pointer = driver.findElement(By.xpath(xpath));
            actions.dragAndDropBy(pointer, slideMove, 0)
                    .build()
                    .perform();
            pointer = driver.findElement(By.xpath(xpath));
            slideAmount = Long.parseLong(pointer.findElement(By.xpath("./div")).getText());
        }
    }
}
