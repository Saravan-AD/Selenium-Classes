package com.automation.selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com");

        TakesScreenshot ts=(TakesScreenshot) driver;
        File file=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("src//test//resources//screenshot.jpg"));
    }
}
