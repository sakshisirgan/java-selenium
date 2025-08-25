package exceptionHandlingWithSelenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
 
import java.time.Duration;
 
public class WaitHandlingExample {
   public static void main(String[] args) {
       WebDriver driver = new ChromeDriver();
 
       try {
          driver.get("https://example.com");
 
          WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("some-id")));
          element.click();
       } catch (TimeoutException e) {
          System.out.println("Element was not visible in time: " + e.getMessage());
       } finally {
          driver.quit();
       }
   }
   public WebElement findElementSafely(WebDriver driver, By locator) {
	   try {
	       return driver.findElement(locator);
	   } catch (NoSuchElementException e) {
	      System.out.println("Element not found: " + locator);
	       return null;
	   }
	}
}

