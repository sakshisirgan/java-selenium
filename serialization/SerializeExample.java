// Step 2: Serialize the Object (Write to File)

package serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
 
public class SerializeExample {
   public static void main(String[] args) {
       Student s1 = new Student("Brian",20);
 
       try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
          out.writeObject(s1);
          System.out.println("Object serialized to student.ser");
       } catch (Exception e) {
          e.printStackTrace();
       }
       System.out.println("Absolute path: " + new File("student.ser").getAbsolutePath());

   }
}

