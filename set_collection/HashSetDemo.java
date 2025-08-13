package set_collection;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
 
        Person p1 = new Person("Harry", 25);
        Person p2 = new Person("Steven", 30);
        Person p3 = new Person("Harry", 25); // Same as p1
        
        // All three objects are created separately (different memory locations),
        // but p1 and p3 have the same name and age.
 
        people.add(p1);   // p1 is sharing a different memory loc
        people.add(p2);
        people.add(p3); // Will NOT be added(duplicate) // // p3 is sharing a different memory loc
        
         // p3 will NOT be added to the set because p1.equals(p3) is true,
        // and HashSet does not allow duplicate entries based on equals() and hashCode().

 
 
        System.out.println("People in HashSet:");
        for (Person p : people) {
            System.out.println(p + " - hashCode: " + p.hashCode());
        }
    }

}
