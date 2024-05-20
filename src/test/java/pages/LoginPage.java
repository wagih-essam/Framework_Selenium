package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {


    private final By userName = By.name("username");
    private final By passWord = By.name("password");
    private final By loginButton = By.xpath("//li[@id='notSignedItem']");
    private final   By xButton= By.xpath("//div[@id='onetrust-close-btn-container']");

    public  void closeCookies(){

        driver.findElement(xButton).click();
    }


    public void enterUserName(String username) {
        driver.findElement(userName).sendKeys(username);
    }

    public void enterPassWord(String password) {
        driver.findElement(passWord).sendKeys(password);
    }

    public void clickOnLoginButton() {
        driver.findElement(loginButton).click();
    }


}