package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class WebDriverSingleton {
    private static WebDriver webDriver;
    private static WebDriverSingleton webDriverSingleton = null;
    public static WebDriverSingleton getWebDriverSingleton(){
        if(webDriverSingleton == null){
            webDriverSingleton = new WebDriverSingleton();
        }
        return webDriverSingleton;
    }
    public static WebDriver getWebDriver(){
        return webDriver;
    }
    public void setDriverCapabilities(){
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--disable-popup-blocking");
        options.addArguments("start-maximized");
        options.addArguments("disable-infobars");
        webDriver = new EdgeDriver(options);
    }
    public WebDriverSingleton(){
        setDriverCapabilities();
    }


    public void navigateTo(String link) {
        webDriver.navigate().to(link);
    }
    public void refreshCurrentUrl(){
        webDriver.navigate().refresh();
    }
    public void resetCashe(){
        webDriver.manage().deleteAllCookies();
    }
    public void close(){
        webDriver.quit();
    }
}
