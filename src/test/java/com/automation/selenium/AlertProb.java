package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class AlertProb {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement button1=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
//        button1.click();
        Alert alert1= driver.switchTo().alert();
        System.out.println(alert1.getText());
        Thread.sleep(1000);
        alert1.accept();
        WebElement button2=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
        button2.click();
        Alert alert2= driver.switchTo().alert();
        System.out.println(alert1.getText());
        Thread.sleep(1000);
        alert2.dismiss();
        WebElement button3=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        button3.click();
        Alert alert3= driver.switchTo().alert();
        System.out.println(alert1.getText());
        Thread.sleep(1000);
        alert3.sendKeys("Hello");

    }
}
