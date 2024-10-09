package com.automation.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
//    @Parameters("browser")
@Parameters({"username","password"})
    @Test(groups = "Smoke")
    public void verifyUserCanPassParameters(String user,String password){
        System.out.println(user);
        System.out.println(password);
    }

    @Test(groups = "Smoke",dataProvider = "getInvalidData")
    public void verifyUserCanPerformDataDrivenTest(String user,String password){
        System.out.println(user);
        System.out.println(password);
    }

    @DataProvider
    public Object[][] getInvalidData(){
    String[][] credentials={
            {"abc","123"},
            {"zxc","324"}
        };
        return credentials;
    }
}
