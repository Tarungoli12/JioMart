package com.automation.utils;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CucumberReportManager {
    static Scenario scenario;

    public static void setScenario(Scenario scenario){
        CucumberReportManager.scenario = scenario;
    }

    public static void attachScreenshot(){
        TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();
        byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png","screen shot");
    }

    public static void addLog(String message){
        scenario.log(message);
    }

}
