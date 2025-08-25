package stepDefinitions;
 
import io.cucumber.java.en.*;
import static org.junit.Assert.*;
 
public class LoginSteps {
 
   private String username;
   private String password;
   private String welcomeMessage;
 
   @Given("the user is on the login page")
   public void the_user_is_on_the_login_page() {
       // Simulate visiting the login page
      System.out.println("User is on login page.");
   }
 
   @When("the user enters username {string} and password {string}")
   public void the_user_enters_username_and_password(String username, String password) {
       this.username = username;
       this.password = password;
 
       // Simulated login logic
       if (("user1".equals(username) && "pass1".equals(password)) ||
           ("user2".equals(username) && "pass2".equals(password))) {
          welcomeMessage = "Welcome " + username + "!";
       } else {
          welcomeMessage = "Invalid credentials";
       }
   }
 
   @Then("the user should see the welcome message {string}")
   public void the_user_should_see_the_welcome_message(String expectedMessage) {
      assertEquals(expectedMessage, welcomeMessage);
   }
}
