package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {




    public void enterSearchWord(String searchField) {
          WebElement searchFieldArea = driver.findElement(By.xpath("//*[@id='APjFqb']"));
          searchFieldArea.sendKeys(searchField);
    }

    public void clickOnSearchField() {
         final By searchButton = By.id("btnK");
        driver.findElement(searchButton).click();
    }

    public LoginPage goToLoginPage(){
        return new LoginPage();
    }
}

