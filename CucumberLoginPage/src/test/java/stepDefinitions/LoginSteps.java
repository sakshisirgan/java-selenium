package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.*;
 
public class LoginSteps {
 
   WebDriver driver;
   LoginPage loginPage;
 
 
 
// Write the code wrt the feature file included in this project
   @Given("the user is on the login page")
   public void user_is_on_login_page() {
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("file:///C:\\Users\\saksh\\HTML table\\loginpage.html");
       loginPage = new LoginPage(driver);
   }

 
   @When("the user enters valid credentials")
   public void enter_valid_credentials() {
      loginPage.enterUsername("validUser");
      loginPage.enterPassword("validPass");
   }
 
   @When("the user enters invalid credentials")
   public void enter_invalid_credentials() {
      loginPage.enterUsername("wrongUser");
      loginPage.enterPassword("wrongPass");
   }
 
   @And("clicks the login button")
   public void click_login_button() {
      loginPage.clickLogin();
   }
 
   @Then("the user should be redirected to the dashboard")
   public void user_should_see_dashboard() {
       String url = driver.getCurrentUrl();
      assertTrue("User is not on dashboard", url.contains("dashboard"));
       driver.quit();
   }
 
   @Then("an error message should be displayed")
   public void error_message_should_be_displayed() {
      assertTrue("Error message not visible", loginPage.isErrorVisible());
       //driver.quit();
   }
}
