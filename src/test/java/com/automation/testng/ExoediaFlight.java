package com.automation.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;

public class ExoediaFlight {

    private WebDriver driver;

    @BeforeClass
    public void openSite(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.expedia.co.in/");
    }

    @Test
    public void operation() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds((60)));
        Actions actions=new Actions(driver);
        WebElement flights=driver.findElement(By.xpath("//span[text()='Flights']"));
        flights.click();
        WebElement oneWay=driver.findElement(By.xpath("//span[text()='One-way']"));
        oneWay.click();
        WebElement source=driver.findElement(By.xpath("//button[@aria-label='Leaving from']"));
        source.click();
        WebElement sourceText=driver.findElement(By.xpath("//div[@id='search-location-input-field']//input"));
        sourceText.sendKeys("Thiruvananthapuram");
        sourceText.sendKeys(Keys.ENTER);
        WebElement destination=driver.findElement(By.xpath("//button[@aria-label='Going to']"));
        destination.click();
        WebElement destText=driver.findElement(By.xpath("//div[@id='search-location-input-field']//input"));
        destText.sendKeys("Mumbai");
        destText.sendKeys(Keys.ENTER);
        WebElement month=driver.findElement(By.xpath("//div[@class='uitk-field has-floatedLabel-label has-icon has-placeholder']/button[@data-testid='uitk-date-selector-input1-default']"));
        month.click();
//        WebElement montButton=driver.findElement(By.xpath("//div[@class='uitk-cal-controls-button uitk-cal-controls-button-inset-multi uitk-cal-controls-button-next']/button[@class='uitk-button uitk-button-medium uitk-button-only-icon uitk-button-paging']"));
//        if(!monthYear.getText().equals("December 2024"))
//            montButton.click();
        while (true){
            Thread.sleep(500);
            System.out.println(11111);
            WebElement monthYear=driver.findElement(By.xpath("//div[@class='uitk-month uitk-month-double uitk-month-double-right']/span"));
            if(monthYear.getText().equals("December 2024"))
                break;
            WebElement montButton=driver.findElement(By.xpath("//div[@class='uitk-cal-controls-button uitk-cal-controls-button-inset-multi uitk-cal-controls-button-next']/button[@class='uitk-button uitk-button-medium uitk-button-only-icon uitk-button-paging']"));
            montButton.click();
        }
        WebElement date=driver.findElement(By.xpath("//div[@class='uitk-month uitk-month-double uitk-month-double-right']//td[@class='uitk-day']//div[text()='15']"));
        date.click();
        WebElement okButton=driver.findElement(By.xpath("//button[@data-stid='apply-date-selector']"));
        okButton.click();
        WebElement searchButton=driver.findElement(By.id("search_button"));
        searchButton.click();
        Thread.sleep(60000);
        WebElement direct=driver.findElement(By.xpath("//input[@name='NUM_OF_STOPS']"));
        if(!direct.isSelected()){
            direct.click();
        }
        Thread.sleep(5000);

    }
}
