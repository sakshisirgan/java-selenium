package steps;

import io.cucumber.java.en.*;
import io.cucumber.datatable.DataTable;
import model.User;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;  // JUnit 5 assertions

public class UserSteps {

	private List<Object> users;

	@Given("the following user data:")
	public void the_following_user_data(DataTable table) {
		List<Map<String, String>> rows = table.asMaps(String.class, String.class);

		// Build User objects from each row
		users = rows.stream()
				.map(row -> new User(
						row.get("name").trim(),
						Integer.parseInt(row.get("age").trim()),
						row.get("email").trim()
						))
				.collect(Collectors.toList());
	}

	@When("I process the user data")
	public void i_process_the_user_data() {
		users.forEach(u -> System.out.println("User: " + u));
		// Add real processing here if needed
	}

	@Then("I should have {int} users")
	public void i_should_have_users(Integer expectedCount) {
		assertEquals(expectedCount.intValue(), users.size());
	}

	@Then("all emails should contain \"@\"")
	public void all_emails_should_contain_at() {
		for (Object user : users) {
			assertTrue(((User) user).getEmail().contains("@"),
					"Email missing '@': " + ((User) user).getEmail());
		}
	}
}
