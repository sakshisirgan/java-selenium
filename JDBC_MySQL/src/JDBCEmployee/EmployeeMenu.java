package JDBCEmployee;

import java.util.Scanner;

public class EmployeeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertEmployee insert = new InsertEmployee();
        DeleteEmployee delete = new DeleteEmployee();
        UpdateEmployee update = new UpdateEmployee();
        DisplayEmployee display = new DisplayEmployee();

        int choice;

        do {
            System.out.println("\nEmployee Menu");
            System.out.println("1. Insert a new Record");
            System.out.println("2. Delete a record");
            System.out.println("3. Update the record");
            System.out.println("4. Display all the records");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> insert.insertRecord();
                case 2 -> delete.deleteRecord();
                case 3 -> update.updateRecord();
                case 4 -> display.displayAll();
                case 5 -> System.out.println("Exited!");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
