package test.java;

import java.sql.Date;
import org.junit.jupiter.api.*;
import main.java.Customer;
import main.java.CustomerProductShop;
import main.java.Product;

public class CustomerProductTest {

    @Test
    public void testInsertCustomer() {
        CustomerProductShop service = new CustomerProductShop();
        Customer customer = new Customer(0, "Sakshi", "7350086934", "F", "Santosh Nagar", "Solapur", "413004");
        int custId = service.insertCustomer(customer);
        Assertions.assertTrue(custId > 0, "Customer ID should be > 0");
    }

    @Test
    public void testInsertProduct() {
        CustomerProductShop service = new CustomerProductShop();
        Customer customer = new Customer(0, "Sakshi", "7350086934", "F", "Santosh Nagar", "Solapur", "413004");
        int custId = service.insertCustomer(customer);

        Product product = new Product(0, "P100", "Laptop", 55000.50, 5, Date.valueOf("2025-08-16"));
        int productId = service.insertProduct(custId, product);

        Assertions.assertTrue(productId > 0, "Product ID should be > 0");
    }

    @Test
    public void testBuyProduct() {
        CustomerProductShop service = new CustomerProductShop();
        Customer customer = new Customer(0, "Sakshi", "7350086934", "F", "Santosh Nagar", "Solapur", "413004");
        int custId = service.insertCustomer(customer);

        Product product = new Product(0, "P001", "Laptop", 55000.50, 5, Date.valueOf("2025-08-16"));
        int productId = service.insertProduct(custId, product);

        boolean status = service.buyProduct(productId, 2);
        Assertions.assertTrue(status, "Should be able to buy product when quantity is enough");
    }

    @Test
    public void testDisplayCustomerProducts() {
        CustomerProductShop service = new CustomerProductShop();
        Customer customer = new Customer(0, "Sakshi", "7350086934", "F", "Santosh Nagar", "Solapur", "413004");
        int custId = service.insertCustomer(customer);

        Product product = new Product(0, "P001", "Laptop", 55000.50, 5, Date.valueOf("2025-08-16"));
        service.insertProduct(custId, product);

        Assertions.assertFalse(service.displayCustomerProducts(custId).isEmpty(), "Display list should not be empty");
    }
}
