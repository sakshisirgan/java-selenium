package Integration_testing;

public class User {

	private String id;

	private String name;


	public User(String id, String name) {

		this.id = id;

		this.name = name;

	}


	// Getters

	public String getId() {
		return id; 
	}

	public String getName() {
		return name;
	}

}