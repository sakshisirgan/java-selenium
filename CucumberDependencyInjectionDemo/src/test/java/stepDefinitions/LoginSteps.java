package stepDefinitions;

import io.cucumber.java.en.Given;
import services.LoginService;

public class LoginSteps {

   private final LoginService loginService;

   public LoginSteps(LoginService loginService) {
      this.loginService = loginService;
   }

   @Given("the user enters username {string} and password {string}")
   public void the_user_enters_username_and_password(String username, String password) {
      loginService.setCredentials(username, password);
   }
}
