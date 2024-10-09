package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Iframe {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
        driver.switchTo().frame(iframe);
        List<WebElement> pic=driver.findElements(By.xpath("//ul[@id='gallery']/li"));
        System.out.println(pic.size());
        driver.switchTo().defaultContent();
    }
}
