package tests;

import driver.WebDriverSingleton;
import platform.MyApplication;

public class BaseTest {
    protected static WebDriverSingleton webDriver ;
    protected static MyApplication myapp = new MyApplication();

    public BaseTest(){
        webDriver = WebDriverSingleton.getWebDriverSingleton();
    }

}
