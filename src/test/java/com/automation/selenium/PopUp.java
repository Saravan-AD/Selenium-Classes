package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.minted.com/");
        while (true){
            try {
                WebElement popup = driver.findElement(By.id("bx-element-2671071-Gu64MsV-input"));
                popup.sendKeys("xyz@gmail.com");
                break;
            }
            catch (Exception e){}

        }
    }
}

//do waiting.java
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds((60)));