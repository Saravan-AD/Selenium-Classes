package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DragDrop {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
        driver.switchTo().frame(iframe);
        List<WebElement> pic=driver.findElements(By.xpath("//ul[@id='gallery']/li"));
        WebElement target = driver.findElement(By.id("trash"));
        Actions actions = new Actions(driver);
//        for(int i=1;i<= pic.size();i++) {
//            WebElement source = pic.get(i);
//
//
//            Actions actions = new Actions(driver);
//            actions.dragAndDrop(source, target).build().perform();
//        }
        for (WebElement image:pic){
            actions.dragAndDrop(image, target).build().perform();
        }
    }
}
