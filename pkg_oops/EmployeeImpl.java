package pkg_oops;

public class EmployeeImpl {
	public static void main(String[] args) {
		
		 // First 5 employees using constructor
        Employee emp1 = new Employee(101, "Marie", "Finance", 35000);
        Employee emp2 = new Employee(102, "Elsie", "HR", 46000);
        Employee emp3 = new Employee(103, "John", "Marketing", 25000);
        Employee emp4 = new Employee(104, "Ken", "Sales", 36000);
        Employee emp5 = new Employee(105, "Bob", "IT", 45000);

        // Display first 5 Employees
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        System.out.println(emp5);

        // Next 5 employees using getter and setters
        Employee emp6 = new Employee();
        emp6.setId(106);
        emp6.setName("Luna");
        emp6.setDepartment("Finance");
        emp6.setSalary(47000);

        Employee emp7 = new Employee();
        emp7.setId(107);
        emp7.setName("George");
        emp7.setDepartment("HR");
        emp7.setSalary(64000);

        Employee emp8 = new Employee();
        emp8.setId(108);
        emp8.setName("Susan");
        emp8.setDepartment("Marketing");
        emp8.setSalary(29000);

        Employee emp9 = new Employee();
        emp9.setId(109);
        emp9.setName("Joey");
        emp9.setDepartment("Sales");
        emp9.setSalary(34000);

        Employee emp10 = new Employee();
        emp10.setId(110);
        emp10.setName("David");
        emp10.setDepartment("IT");
        emp10.setSalary(81000);

        // Display next 5 employees
        System.out.println(emp6);
        System.out.println(emp7);
        System.out.println(emp8);
        System.out.println(emp9);
        System.out.println(emp10);
	}
}
