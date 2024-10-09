package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebayContact {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.co.uk/itm/395721635127?mkcid=16&mkevt=1&mkrid=711-127632-2357-0&ssspo=hw_wju2qqu2&sssrc=2047675&ssuid=&widget_ver=artemis&media=COPY");
        WebElement contactClick=driver.findElement(By.xpath("//span[@class='details__icon']"));
        contactClick.click();
        WebElement phone=driver.findElement(By.xpath("//span[text()='Phone:']/following-sibling::span"));
        WebElement email=driver.findElement(By.xpath("//span[text()='Email:']/following-sibling::span"));
        System.out.println(phone.getText());
        System.out.println(email.getText());
    }
}
