package pages;

import driver.WebDriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends BasePage {
    private  final By  userNameField = By.id("user-name");
    private final By  passWordField = By.id("password");
    private final By  loginButton = By.id("login-button");

    public void login(String username,String password){
        WebDriverSingleton.getWebDriver().findElement(userNameField).sendKeys(username);
        WebDriverSingleton.getWebDriver().findElement(passWordField).sendKeys(password);
        WebDriverSingleton.getWebDriver().findElement(loginButton).click();
    }

    public void enterUserNAme(String username){
        WebDriverSingleton.getWebDriver().findElement(userNameField).sendKeys(username);
    }
    public void enterPassWord(String password){
        WebDriverSingleton.getWebDriver().findElement(passWordField).sendKeys(password);
    }
    public void clickLoginButton(){
        WebDriverSingleton.getWebDriver().findElement(loginButton).click();
    }



}