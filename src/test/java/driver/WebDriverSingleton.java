package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class WebDriverSingleton {
    private static WebDriver webDriver;
    private static WebDriverSingleton webDriverSingleton = null;

    private WebDriverSingleton() {
        setDriverCapabilities();
    }

    public static WebDriverSingleton getWebDriverSingleton() {
        if (webDriverSingleton == null) {
            webDriverSingleton = new WebDriverSingleton();
        }
        return webDriverSingleton;
    }

    public void setDriverCapabilities() {
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-popup-blocking");
        options.addArguments("start-maximized");
//        options.addArguments("disable-infobars");
        webDriver = new ChromeDriver(options);
    }



    public static WebDriver getWebDriver() {
        return webDriver;
    }


    public void navigateTo(String link) {
        webDriver.navigate().to(link);
    }

    public void refreshCurrentUrl() {
        webDriver.navigate().refresh();
    }

    public void resetcach() {
        webDriver.manage().deleteAllCookies();
    }

    public void close() {
        webDriver.quit();
    }
}
