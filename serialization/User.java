package serialization;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L; 

    String username;
    String email;
    int age;
    int id; 

    public User(String username, String email, int age, int id) {
        this.username = username;
        this.email = email;
        this.age = age;
        this.id = id;
    }

    public void display() {
        System.out.println("Name: " + username + ", Age: " + age + ", Email: " + email + ", ID: " + id);
    }
}
