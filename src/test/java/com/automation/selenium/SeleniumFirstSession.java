package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumFirstSession {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");

        WebElement usernameInput=driver.findElement(By.id("user-name"));
        WebElement passwordInput=driver.findElement(By.id("password"));
        List<WebElement> loginBtn=driver.findElements(By.id("login-button"));


        usernameInput.sendKeys("standard_user");
        passwordInput.sendKeys("secret_sauce");
        loginBtn.get(0).click();
        List<WebElement> prodName=driver.findElements(By.xpath("//div[@data-test='inventory-item-name']"));
        for (WebElement product : prodName) {
            String productName = product.getText();
            System.out.println(productName);
        }
        List<WebElement> addButton=driver.findElements(By.className("btn_primary"));
        addButton.get(0).click();
        WebElement cartButton=driver.findElement(By.className("shopping_cart_link"));
        cartButton.click();
        WebElement pName= driver.findElement(By.className("inventory_item_name"));
        System.out.println(pName.getText());
        WebElement pPrice= driver.findElement(By.className("inventory_item_price"));
        System.out.println(pPrice.getText());
    }
}
