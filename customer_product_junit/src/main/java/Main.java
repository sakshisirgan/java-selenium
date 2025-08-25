package main.java;

import java.sql.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerProductShop shop = new CustomerProductShop();

        while (true) {
            System.out.println("\n===== CUSTOMER PRODUCT SHOP MENU =====");
            System.out.println("1. Insert Customer");
            System.out.println("2. Insert Product");
            System.out.println("3. Buy Product");
            System.out.println("4. Display Customer Products & Total Price");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Mobile: ");
                    String mobile = sc.nextLine();
                    System.out.print("Enter Gender (M/F): ");
                    String gender = sc.nextLine();
                    System.out.print("Enter Street: ");
                    String street = sc.nextLine();
                    System.out.print("Enter City: ");
                    String city = sc.nextLine();
                    System.out.print("Enter Pincode: ");
                    String pincode = sc.nextLine();

                    Customer cust = new Customer(0, name, mobile, gender, street, city, pincode);
                    int custId = shop.insertCustomer(cust);
                    System.out.println("Customer inserted with ID: " + custId);
                    break;

                case 2:
                    System.out.print("Enter Customer ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Code: ");
                    String code = sc.nextLine();
                    System.out.print("Enter Product Name: ");
                    String pname = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Expiry Date (yyyy-mm-dd): ");
                    Date expiry = Date.valueOf(sc.nextLine());

                    Product prod = new Product(0, code, pname, price, qty, expiry);
                    int prodId = shop.insertProduct(cid, prod);
                    System.out.println("Product inserted with ID: " + prodId);
                    break;

                case 3:
                    System.out.print("Enter Product ID: ");
                    int pid = sc.nextInt();
                    System.out.print("Enter Quantity to Buy: ");
                    int buyQty = sc.nextInt();

                    boolean status = shop.buyProduct(pid, buyQty);
                    System.out.println(status ? "Purchase successful!" : "Purchase failed!");
                    break;

                case 4:
                    System.out.print("Enter Customer ID: ");
                    int custDisplayId = sc.nextInt();
                    System.out.println(shop.displayCustomerProducts(custDisplayId));
                    break;

                case 5:
                    System.out.println("Exited!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
