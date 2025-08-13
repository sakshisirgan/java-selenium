package pkg_oops;

public class MobileImpl {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile("Oneplus", 2024);
        System.out.println(mobile1);

        Mobile mobile2 = new Mobile("Apple", 2025);
        System.out.println(mobile2);
        
        Mobile demoMobile = new Mobile(); // default constructor
    }
}

