package pages;

import driver.WebDriverSingleton;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver = WebDriverSingleton.getWebDriver();
}
