package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class LoginPage {
 
   WebDriver driver;
 
   @FindBy(id = "username")
   WebElement usernameInput;
 
   @FindBy(id = "password")
   WebElement passwordInput;
 
   @FindBy(id = "loginButton")
   WebElement loginButton;
 
   @FindBy(id = "error")
   WebElement errorMessage;
 
   public LoginPage(WebDriver driver) {
       this.driver = driver;
      PageFactory.initElements(driver, this);
   }
 
   public void enterUsername(String username) {
      usernameInput.clear();
      usernameInput.sendKeys(username);
   }
 
   public void enterPassword(String password) {
      passwordInput.clear();
      passwordInput.sendKeys(password);
   }
 
   public void clickLogin() {
      loginButton.click();
   }
 
   public boolean isErrorVisible() {
       return errorMessage.isDisplayed();
   }
}

