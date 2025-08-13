package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeUser {
    public static void main(String[] args) throws Exception {
        User user = new User("alice", "alice@example.com", 23, 1);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.ser"));
        out.writeObject(user);
        System.out.println("Object serialized to user.ser");
        System.out.println(user);
        out.close();
    }
}
