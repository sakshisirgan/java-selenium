package test;

import java.io.IOException;

import java.util.List;

import Integration_testing.User;
import Integration_testing.UserRepository;
import Integration_testing.UserService;


public class IntegrationTest {

	public static void main(String[] args) throws IOException {

		// Setup

		String testFilePath = "C:\\Users\\saksh\\Desktop\\test_users.txt";

		UserRepository repo = new UserRepository(testFilePath);

//		repo.clear(); // make sure the file is empty before testing


		UserService service = new UserService(repo);


		// Test

		service.registerUser("1", "User1");

		service.registerUser("2", "User2");


		List<User> users = service.getAllUsers();


		assert users.size() == 2 : "Expected 2 users";

		assert users.get(0).getName().equals("User1");

		assert users.get(1).getName().equals("User2");


		System.out.println("Integration test passed!");


		// Clean up

//		repo.clear();

	}

}