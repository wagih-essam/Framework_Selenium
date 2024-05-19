package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverSingleton {
    public static WebDriverSingleton webDriverSingleton = null ;
    public static WebDriver webDriver;

    public WebDriverSingleton(){
        setCapabilities();
    }

    public WebDriverSingleton getWebDriverSingleton(){
        if(webDriverSingleton==null){
            webDriverSingleton = new WebDriverSingleton();
        }
        return webDriverSingleton;
    }

    public static WebDriver getWebDriver(){
        return webDriver;
    }

    public void setCapabilities(){
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("start-maximized");
        options.addArguments("disible-infobars");
        options.addArguments("--disable-extensions");
        options.addArguments("--enable-javascript");
    }

    public void navigateTo(String x){
        webDriver.navigate().to("");
    }
    public void quit(){
        webDriver.quit();
    }
    public void resetCashe(){
        webDriver.manage().deleteAllCookies();
    }
}
