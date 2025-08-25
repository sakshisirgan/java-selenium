package testopenmrs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NopCommerce {
    public static void main(String[] args) {
        // Set up ChromeDriver (make sure chromedriver is in PATH or WebDriverManager is used)
        WebDriver driver = new ChromeDriver();
        
        // Open NopCommerce demo site
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        
        // Click on the "Log in" link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        
        // Enter email
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("admin@gmail.com"); // use a valid account email
        
        // Enter password
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("Admin123"); // use the correct password
        
        // Click on Login button
        WebElement loginBtn = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        loginBtn.click();
        
        // Optional: verify login success
        if (driver.getPageSource().contains("Log out")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }
        
        // Close browser
        driver.quit();
    }
}

