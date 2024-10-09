package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Ebay2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.co.uk");
        WebElement advButton=driver.findElement(By.xpath("//td[@id='gh-as-td']/a[@id='gh-as-a']"));
        advButton.click();
        WebElement searchBox=driver.findElement(By.xpath("//input[@id='_nkw']"));
        searchBox.sendKeys("TV");
        WebElement min=driver.findElement(By.xpath("//input[@id='s0-1-17-5[2]-@range-comp[]-@range-textbox[]-textbox']"));
        min.sendKeys("10");
        WebElement max=driver.findElement(By.xpath("//input[@id='s0-1-17-5[2]-@range-comp[]-@range-textbox[]_1-textbox']"));
        max.sendKeys("1000");
        WebElement condition=driver.findElement((By.xpath("//input[@id='s0-1-17-6[4]-[0]-LH_ItemCondition']")));
        condition.click();
        WebElement loc=driver.findElement((By.xpath("//input[@id='s0-1-17-6[7]-[7]-LH_LocatedIn']")));
        loc.click();
        WebElement searchButton=driver.findElement(By.xpath("//div[@class='adv-form__actions']//button[@type='submit']"));
        searchButton.click();
        List<WebElement> prodLink = driver.findElements(By.xpath("//a[@class='s-item__link' and not(ancestor::li[contains(@class, 'srp-river-answer')])]"));
        System.out.println(prodLink.size());
        String currentWindow = driver.getWindowHandle();

        for (int i = 2; i < prodLink.size(); i++) {
            prodLink.get(i).click();

            Set<String> allWindow = driver.getWindowHandles();

            for (String window : allWindow) {
                Thread.sleep(1000);
                if (!window.equals(currentWindow)) {
                    driver.switchTo().window(window);
                    System.out.println(1);
                try {
                    WebElement contactClick = driver.findElement(By.xpath("//div[@class='ux-table-section ux-table-section--css-table ux-table-section--contactInformationDropdown']//span[@class='details__icon']"));
                    contactClick.click();
                    WebElement phone = driver.findElement(By.xpath("//span[text()='Phone:']/following-sibling::span"));
                    WebElement email = driver.findElement(By.xpath("//span[text()='Email:']/following-sibling::span"));
                    System.out.println(phone.getText());
                    System.out.println(email.getText());
                    driver.close();
                } catch (Exception e) {
                    System.out.println("Contact info not available");
                    driver.close();
                }
            }
                }
            driver.switchTo().window(currentWindow);
        }
    }
}
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//import java.util.List;
//import java.util.Set;
//
//public class Ebay2 {
//    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.ebay.co.uk");
//
//
//        WebElement advButton = driver.findElement(By.xpath("//td[@id='gh-as-td']/a[@id='gh-as-a']"));
//        advButton.click();
//
//
//        WebElement searchBox = driver.findElement(By.xpath("//input[@id='_nkw']"));
//        searchBox.sendKeys("TV");
//
//
//        WebElement min = driver.findElement(By.xpath("//input[@id='s0-1-17-5[2]-@range-comp[]-@range-textbox[]-textbox']"));
//        min.sendKeys("10");
//        WebElement max = driver.findElement(By.xpath("//input[@id='s0-1-17-5[2]-@range-comp[]-@range-textbox[]_1-textbox']"));
//        max.sendKeys("1000");
//
//
//        WebElement condition = driver.findElement(By.xpath("//input[@id='s0-1-17-6[4]-[0]-LH_ItemCondition']"));
//        condition.click();
//        WebElement loc = driver.findElement(By.xpath("//input[@id='s0-1-17-6[7]-[7]-LH_LocatedIn']"));
//        loc.click();
//
//
//        WebElement searchButton = driver.findElement(By.xpath("//div[@class='adv-form__actions']//button[@type='submit']"));
//        searchButton.click();
//
//
//        List<WebElement> prodLink = driver.findElements(By.xpath("//a[@class='s-item__link' and not(ancestor::li[contains(@class, 'srp-river-answer')])]"));
//        System.out.println(prodLink.size());
//
//        String currentWindow = driver.getWindowHandle();
//
//        for (int i = 2; i < 19; i++) {
//            prodLink.get(i).click();
//
//            Set<String> allWindow = driver.getWindowHandles();
//            for (String window : allWindow) {
//                if (!window.equals(currentWindow)) {
//                    driver.switchTo().window(window);
//
//                    // Use explicit wait for the element to load
//                    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//                    try {
//                        WebElement contactClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ux-table-section ux-table-section--css-table ux-table-section--contactInformationDropdown']//span[@class='details__icon']")));
//                        contactClick.click();
//
//                        WebElement phone = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Phone:']/following-sibling::span")));
//                        WebElement email = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Email:']/following-sibling::span")));
//
//                        System.out.println(phone.getText());
//                        System.out.println(email.getText());
//                    } catch (Exception e) {
//                        System.out.println("Contact information not available on this page.");
//                    }
//
//                    driver.close();
//                }
//            }
//            driver.switchTo().window(currentWindow);
//        }
//        driver.quit();
//    }
//}
