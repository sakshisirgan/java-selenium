// Step 1: Create a Serializable Class

package serialization;

import java.io.Serializable;

public class Student implements Serializable {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String name;
   private int age;
 
   public Student(String name, int age) {
       this.name = name;
       this.age = age;
   }
 
   public void display() {
      System.out.println("Name: " + name + ", Age: " + age);
   }
}

