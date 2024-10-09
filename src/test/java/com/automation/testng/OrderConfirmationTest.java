package com.automation.testng;

import org.testng.annotations.Test;

public class OrderConfirmationTest extends BaseTest {

    @Test(groups = {"Smoke"})
    public  void verifyUserCanPlaceOrder(){
        System.out.println("Order placed");
    }

    @Test(groups = "Regression")
    public  void verifyUserCanCancelOrder(){
        System.out.println("Order cancelled");
    }
}
