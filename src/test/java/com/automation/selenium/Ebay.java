package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ebay {
    public  static  void  main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com");
        WebElement search=driver.findElement(By.id("gh-ac"));
        search.sendKeys("TV");
        WebElement searchButton=driver.findElement(By.id("gh-btn"));
        searchButton.click();
        List<WebElement> productHeading = driver.findElements(By.xpath("//span[@role='heading' and @aria-level='3']"));
        List<WebElement> productPrices = driver.findElements(By.xpath("//span[@class='s-item__price']"));

        int numProducts = Math.min(productHeading.size(), productPrices.size());

        for (int i = 0; i < numProducts; i++) {
            String productName = productHeading.get(i).getText();
            String productPrice = productPrices.get(i).getText();
            System.out.println(productName + " - " + productPrice);
        }

    }
}
