package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableData {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://datatables.net/");
        List<WebElement> tableRow=driver.findElements(By.xpath("//div[@id='example_wrapper']//table/tbody/tr"));
        for(WebElement row : tableRow){

            List<WebElement> rowValue=row.findElements(By.xpath("td"));
            for(WebElement value:rowValue)
                System.out.printf("%-40s",value.getText());
            System.out.println();
        }
    }
}
