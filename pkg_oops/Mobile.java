package pkg_oops;

public class Mobile {
    // Instance variables
    private String brand;
    private int releaseYear;
    
    // Default constructor
    public Mobile() {
        System.out.println("Demo Mobile for trial run");
    }

    public Mobile(String brand, int releaseYear) {
        this.brand = brand;
        this.releaseYear = releaseYear;
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
        
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Mobile [brand=" + brand + ", releaseYear=" + releaseYear + "]";
    }
}

