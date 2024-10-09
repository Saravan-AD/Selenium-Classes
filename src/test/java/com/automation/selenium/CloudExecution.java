package com.automation.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloudExecution {

    public static void main(String[] args) throws MalformedURLException {

        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 11");
        browserOptions.setBrowserVersion("latest");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("username", "oauth-saravanad35-9cebc");
        sauceOptions.put("accessKey", "daa5ed89-84d1-4839-809f-da1cbb4ce9c4");
        sauceOptions.put("build", "selenium-build-EYB6R");
        sauceOptions.put("name", "My first test on cloud");
        browserOptions.setCapability("sauce:options", sauceOptions);

        URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        WebDriver driver = new RemoteWebDriver(url, browserOptions);

        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");
        WebElement search=driver.findElement(By.id("gh-ac"));
        search.sendKeys("TV");
        WebElement searchButton=driver.findElement(By.id("gh-btn"));
        searchButton.click();
        List<WebElement> productHeading = driver.findElements(By.xpath("//span[@role='heading' and @aria-level='3']"));
        List<WebElement> productPrices = driver.findElements(By.xpath("//span[@class='s-item__price']"));

        int numProducts = Math.min(productHeading.size(), productPrices.size());

        for (int i = 0; i < numProducts; i++) {
            String productName = productHeading.get(i).getText();
            String productPrice = productPrices.get(i).getText();
            System.out.println(productName + " - " + productPrice);
        }
        driver.quit();
    }
}
