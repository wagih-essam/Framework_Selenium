package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private final By userName = By.name("username");
    private final By passWord = By.name("password");
    private final By loginButton = By.xpath("");
    private final By searchField = By.name("q");
    private final By searchButton = By.id("btnK");


    public void enterUserName(String username){
        driver.findElement(userName).sendKeys(username);
    }
    public void enterPassWord(String password){
        driver.findElement(passWord).sendKeys(password);
    }
    public void clickOnLoginButton(){
        driver.findElement(loginButton).click();
    }
    public void enterSearchWord(String searchfield){
        driver.findElement(searchField).sendKeys(searchfield);
    }
    public void clickOnSearchField(){
        driver.findElement(searchButton).click();
    }
}
