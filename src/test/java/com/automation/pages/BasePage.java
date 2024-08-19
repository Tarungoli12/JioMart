package com.automation.pages;

import com.automation.utils.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    WebDriver driver;
    JavascriptExecutor js ;

    public BasePage(){
        this.driver = DriverManager.getDriver();
        js = (JavascriptExecutor)driver;
        PageFactory.initElements(driver,this);
    }

    public  void jsClick(WebElement element){
        js.executeScript("arguments[0].click();",element);
    }

}
