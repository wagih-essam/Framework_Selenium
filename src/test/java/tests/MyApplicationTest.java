package tests;

import org.testng.annotations.Test;
import platform.MyApplication;

public class MyApplicationTest extends BaseTest{



    @Test(priority = 1)
    public void makeGoogleSearch() throws InterruptedException{
        webDriver.navigateTo("https://web.vodafone.com.eg/ar/home");
        Thread.sleep(2000);
//
//      myapp.search.enterSearchWord("Vodafone Egypt");
//
//
//
//        myapp.search.clickOnSearchField();
//        Thread.sleep(2000);


    }
    @Test(priority = 2)
    public  void login() throws InterruptedException {

        myapp.login    =myapp.search.goToLoginPage()  ;
        Thread.sleep(2000);
        myapp.login.closeCookies();
        Thread.sleep(2000);
        myapp.login.clickOnLoginButton();

//        myapp.login.enterUserName("asdasf");
//        myapp.login.enterPassWord("6565dasdfq");
    }



}
