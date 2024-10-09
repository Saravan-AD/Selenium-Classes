package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com");

        WebElement catElement=driver.findElement(By.id("gh-cat"));
        Select catSelect=new Select(catElement);

        catSelect.selectByVisibleText("Business & Industrial");
        Thread.sleep(3000);
        catSelect.selectByValue("11450");
        Thread.sleep(3000);
        catSelect.selectByIndex(10);
    }
}
