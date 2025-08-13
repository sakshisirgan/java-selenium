package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
public class WriteFileExample {
   public static void main(String[] args) {
       try (FileWriter writer = new FileWriter("C:\\Users\\saksh\\Desktop\\myfile.txt")) {
          writer.write("Hello, Java File Handling!\nHey Sakshi Let's Work!");
       } catch (IOException e) {
          e.printStackTrace();
       }
   }
}

