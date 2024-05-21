package tests;

import org.testng.annotations.Test;
import platform.MyApplication;

public class MyApplicationTest extends BaseTest{
    @Test(priority = 1)
    public void makeGoogleSearch() throws InterruptedException{
        webDriver.navigateTo("https://www.google.com/");
        myapp.loginpage.enterSearchWord("Vodafone Egypt");
        Thread.sleep(2000);
        myapp.loginpage.clickOnSearchField();
        Thread.sleep(2000);
        System.out.println("Passed");
    }
}
