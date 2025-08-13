package FileHandling;

import java.io.File;
public class DeleteFile {
   public static void main(String[] args) {
       File file = new File("C:\\Users\\saksh\\Desktop\\myfile.txt");
       if (file.delete()) {
          System.out.println("Deleted the file: " + file.getName());
       } else {
          System.out.println("Failed to delete the file.");
       }
       //file.close();   Don't write this line Because File in java.io.File is not a stream, it only represents a file path.
       // It doesn't have a close() method — calling file.close() causes a compile-time error.
}
}

