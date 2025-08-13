package list_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerDetails {
    public static void main(String[] args) {

        List<Customer> customerList = new ArrayList<>();

        // Adding Customers
        customerList.add(new Customer(1, "Jay", 12345, "Rajasthan", 23, "jay@gmail.com"));
        customerList.add(new Customer(2, "Hari", 67890, "Maharashtra", 10, "hari@gmail.com"));
        customerList.add(new Customer(3, "Mohan", 65478, "Delhi", 13, "mohan@gmail.com"));
        customerList.add(new Customer(4, "Swati", 87546, "Gujrat", 20, "swati@gmail.com"));
        customerList.add(new Customer(5, "Pooja", 37896, "Karnataka", 23, "pooja@gmail.com"));

        // Display all customers
        System.out.println("All Customers:");
        for (Customer cust : customerList) {
            System.out.println(cust);
        }

        // Remove the customer at index 3 using Iterator
        Iterator<Customer> iterator = customerList.iterator();
        int index = 0;
        while (iterator.hasNext()) {
            iterator.next();
            if (index == 3) {
                iterator.remove();
                break;
            }
            index++;
        }

        System.out.println("After removing element at index 3:");
        for (Customer cust : customerList) {
            System.out.println(cust);
        }

        // Find customer with ID 3 using Iterator
        iterator = customerList.iterator();  
        boolean found = false;
        while (iterator.hasNext()) {
            Customer cust = iterator.next();
            if (cust.getId() == 3) {
                System.out.println("Customer " + cust.getId() + " found");
                System.out.println("Name: " + cust.getName());
                System.out.println("Location: " + cust.getLocation());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Customer 3 not found in the list.");
        }
    }
}
