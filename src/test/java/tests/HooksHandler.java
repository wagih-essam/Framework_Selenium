package tests;

import driver.WebDriverSingleton;
import io.cucumber.java.Before;

public class HooksHandler extends BaseTest {
    @Before(order = 1)
    public void initialize(){
        webDriver = WebDriverSingleton.getWebDriverSingleton();
        webDriver.refreshCurrentUrl();
        webDriver.resetCashe();
    }
}
