package testopenmrs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenMRS {
    public static void main(String[] args) {
        // Set up ChromeDriver (make sure chromedriver is in PATH)
        WebDriver driver = new ChromeDriver();
        
        // Open OpenMRS login page
        driver.get("https://o3.openmrs.org/openmrs/spa/login");
        
        // Find username field and enter text
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("admin");
        
        // Find password field and enter text
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Admin123");
        
        // Click login button
        WebElement loginBtn = driver.findElement(By.id("loginButton"));
        loginBtn.click();
        
        // Optional: verify login success by checking page title or URL
        System.out.println("Login test executed!");
        
        // Close browser
        driver.quit();
    }
}

