package tests;

import org.testng.annotations.Test;
import platform.MyApplication;

public class MyApplicationTest extends BaseTest{



    @Test(priority = 1)
    public void makeGoogleSearch() throws InterruptedException{
        webDriver.navigateTo("https://www.saucedemo.com/v1/");
        Thread.sleep(3000);



        myapp.login.login("standard_user","secret_sauce");
    }



}
