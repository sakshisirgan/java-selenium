package set_collection;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
 
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
 
    // Override hashCode() and equals()
    // Overriding hashCode() to return a hash based on name and age
    // This ensures objects with the same data produce the same hash code,
    // which is essential for correct behavior in hash-based collections like HashSet.
    @Override
    public int hashCode() {
        return Objects.hash(name, age); // Combines both fields
    }
    
    // Overriding equals() to define logical equality.
    // Two Person objects are considered equal if their name and age are equal,
    // even if they are different objects in memory.
    @Override
    public boolean equals(Object obj) { 
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person p = (Person) obj;
        return age == p.age && Objects.equals(name, p.name);
    }
 
    
 // toString() method to display Person objects in a readable format.
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

}
