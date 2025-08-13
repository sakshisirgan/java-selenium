package comparator;

import java.util.*;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> person = Arrays.asList(
            new Person("Brian", 30),
            new Person("Harry", 23),
            new Person("Brian", 25)
        );

        System.out.println("Original List");
        System.out.println(person);

        // Sorting by name, then by age
        person.sort(
            Comparator.comparing((Person p) -> p.getName())
                      .thenComparing(p -> p.getAge())
        );

        System.out.println("Sorted list by name then by age: ");
        for (Person p : person) {
            System.out.println(p);
        }
    }
}
