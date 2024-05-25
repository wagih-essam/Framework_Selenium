package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MyApplicationTest extends BaseTest{



    @Test(priority = 1)
    public void loginWebSite() throws InterruptedException{
        webDriver.navigateTo("https://www.saucedemo.com/v1/");
        Thread.sleep(3000);
        myapp.login.login("standard_user","secret_sauce");
        webDriver.close();
        System.out.println("Test Passed");
    }

    @Test(priority = 2)
    public void loginWebSiteTwo(){
        webDriver.navigateTo("https://www.saucedemo.com/v1/");
        myapp.login.enterUserNAme("locked_out_user");
        myapp.login.enterPassWord("secret_sauce");
        myapp.login.clickLoginButton();
        webDriver.close();
    }



}
