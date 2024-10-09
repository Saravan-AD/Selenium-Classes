package com.automation.testng;

import org.testng.annotations.Test;

public class CartPageTest extends BaseTest {
    @Test(groups = {"Smoke"})
    public void verifyUserCanAddItemToCart(){
        System.out.println("Item added");
    }

    @Test(groups = "Regression")
    public void verifyUserCanRemoveItemFromCart(){
        System.out.println("Item removed");
    }

    @Test(groups = "Regression")
    public void verifyUserCanUpdateQuantityOfItemInCart(){
        System.out.println("Quantity updated");
    }
}
