package stepDefinitions;

import io.cucumber.java.en.*;
import io.cucumber.datatable.DataTable;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserSteps {
   private List<String> usernames;
   @Given("the following usernames:")
   public void the_following_usernames(DataTable dataTable) {
       usernames = dataTable.asList(String.class); // Convert table to List<String>
   }
   @When("I process the usernames")
   public void i_process_the_usernames() {
       // Simulate some processing
       for (String username : usernames) {
          System.out.println("Processing user: " + username);
       }
   }
 
   @Then("I should see {int} usernames processed")
   public void i_should_see_usernames_processed(Integer expectedCount) {
      assertEquals(expectedCount.intValue(), usernames.size());
   }
}

