package com.automation.utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;

public class DriverManager {
    static WebDriver driver;

    public static void createDriver(){
        if(ConfigReader.getConfigValue("application.type").equals("mobile")) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", ConfigReader.getConfigValue("platform.name"));
            capabilities.setCapability("deviceName", ConfigReader.getConfigValue("device.name"));
            capabilities.setCapability("automationName", ConfigReader.getConfigValue("automation.name"));
            capabilities.setCapability("app", ConfigReader.getConfigValue("jioMart.app.path"));
            capabilities.setCapability("appActivity", ConfigReader.getConfigValue("jioMart.app.activity"));
            capabilities.setCapability("appPackage", ConfigReader.getConfigValue("jioMart.app.package"));
            driver = new AndroidDriver(capabilities);
        }else{
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
