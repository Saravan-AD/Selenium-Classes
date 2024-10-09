package com.automation.testng;

import org.testng.annotations.*;

public class BaseTest {

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite(){
        System.out.println("Before suite");
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite(){
        System.out.println("after suite");
    }

    @BeforeClass(alwaysRun = true)
    public  void beforeGroup(){
        System.out.println("Before class");
    }

    @AfterClass(alwaysRun = true)
    public  void afterGroup(){
        System.out.println("after class");
    }

    @BeforeMethod(alwaysRun = true)
    public  void beforeMethod(){
        System.out.println("Before method");
    }

    @AfterMethod(alwaysRun = true)
    public  void afterMethod(){
        System.out.println("after method");
    }

    @BeforeTest(alwaysRun = true)
    public  void beforeTest(){
        System.out.println("Before test");
    }

    @AfterTest(alwaysRun = true)
    public  void afterTest(){
        System.out.println("after test");
    }


}
