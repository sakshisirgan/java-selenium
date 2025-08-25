package testopenmrs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Swaglabs {

    public static void main(String[] args) {
    	
    	WebDriver driver = new ChromeDriver();
//		driver.get("https://o3.openmrs.org/openmrs/spa/login");
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        Object result = js.executeScript("return navigator.webdriver;");
 
        System.out.println("navigator.webdriver: " + result);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		driver.findElement(By.id("login-button")).click();
    }
}
