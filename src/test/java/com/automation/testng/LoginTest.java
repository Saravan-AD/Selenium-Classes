package com.automation.testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends BaseTest {

    @Test(groups = {"Smoke"})
    public void verifyUserCanLogin(){
        System.out.println("From test cases");
        Assert.fail();
    }

    @Test(dependsOnMethods = "verifyUserCanLogin")
    public void verifyUserCanLogout(){
        SoftAssert soft=new SoftAssert();
        soft.assertEquals("Test","Test1");
        soft.assertTrue(10==10);
//        soft.assertAll();
        System.out.println("Verify user can logout");
    }

    @Test(groups = "Regression")
    public void verifyUserCannotLoginWithInvalidCred(){
        Assert.assertEquals(10,110);
        Assert.assertTrue("Test".equals("Tes1t"),"Expected is diff");
        System.out.println("Test case2");

    }
}
