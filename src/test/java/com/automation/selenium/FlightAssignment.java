package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class FlightAssignment {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.easemytrip.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds((60)));
        WebElement toButton=driver.findElement(By.id("tocity"));
        toButton.click();
        WebElement toBox=driver.findElement(By.id("a_Editbox13_show"));
        toBox.sendKeys("Thiruvananthapuram");
        WebElement fromButton=driver.findElement(By.id("FromSector_show"));
        fromButton.click();
        WebElement fromBox=driver.findElement(By.id("a_FromSector_show"));
        fromBox.sendKeys("Mumbai");
        WebElement dateButton=driver.findElement(By.id("ddate"));
        dateButton.click();

        while(true){
            WebElement monthChange=driver.findElement(By.xpath("//div[@class='box1']/div[@class='month-sec']/div[@class='month3']/img"));

            WebElement monthSec=driver.findElement(By.xpath("//div[@class='box1']/div[@class='month-sec']/div[@class='month2']"));
            if((monthSec.getText()).equals("JAN 2025"))
                break;
            monthChange.click();
        }
        WebElement days=driver.findElement(By.id("trd_1_13/01/2025"));
        days.click();
        WebElement number=driver.findElement(By.id("ptravlrNo"));
        number.click();
        for(int i=0;i<2;i++){
            WebElement adultNum=driver.findElement(By.xpath("//div[@id='field1']/button[@id='add']"));
            adultNum.click();
        }
        for(int i=0;i<2;i++){
            WebElement childNum=driver.findElement(By.xpath("//div[@id='field2']/button[@id='add']"));
            childNum.click();
        }
        WebElement searchButton=driver.findElement(By.xpath("//div[@id='divSearchFlight']/button"));
        searchButton.click();
        List<WebElement> flightName=driver.findElements(By.xpath("//span[@class='txt-r4 ng-binding']"));
        List<WebElement> flightNumber=driver.findElements(By.xpath("//span[@class='txt-r5']"));
        List<WebElement> price=driver.findElements(By.xpath("//div[@class='col-md-10 col-sm-8 col-xs-9 txt-r6-n exPrc 11']"));
        for (int i=0;i<flightNumber.size();i++){
            System.out.println("Flight name:"+flightName.get(i).getText());
            System.out.println("Flight number:"+flightNumber.get(i).getText());
            System.out.println("Flight price:"+price.get(i).getText());
            System.out.println();
        }
    }
}
