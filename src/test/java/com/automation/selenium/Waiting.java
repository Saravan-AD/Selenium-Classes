package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Waiting {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds((60)));

        WebElement button=driver.findElement(By.xpath("//div[@id='start']/button"));
        button.click();
        Thread.sleep(10000);
        WebElement text=driver.findElement(By.id("finish"));
//        if(text.isDisplayed())
            System.out.println(text.getText());
    }
}
