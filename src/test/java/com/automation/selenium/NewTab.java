package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class NewTab {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");

        WebElement search = driver.findElement(By.id("gh-ac"));
        WebElement searchbtn = driver.findElement(By.id("gh-btn"));
        search.sendKeys("TV");
        searchbtn.click();

        WebElement pdt = driver.findElement(By.xpath("//ul[@class='srp-results srp-list clearfix']//div[@class='s-item__title']"));
        pdt.click();
        String currentWindow = driver.getWindowHandle();
        System.out.println(currentWindow);

        Set<String> allWindow = driver.getWindowHandles();

        for(String window : allWindow){
            if(!window.equals(currentWindow)){
                driver.switchTo().window(window);
            }
        }
        WebElement title = driver.findElement(By.xpath("//h1[@class='x-item-title__mainTitle']/span"));
        System.out.println(title.getText());
        WebElement price = driver.findElement(By.xpath("//div[@class='x-price-primary']/span"));
        System.out.println(price.getText());
        driver.close();
        driver.switchTo().window(currentWindow);
    }
}