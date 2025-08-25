package com.example.fetchData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
 
public class IframeExample {
 
   public static void main(String[] args) throws InterruptedException {
 
        // Initialize WebDriver
       WebDriver driver = new ChromeDriver();
 
       // Load local main.html
       File file = new File("C:/Users/saksh/HTML%20table/main.html");
       String url = "file:///" + file.getAbsolutePath();
       driver.get(url);
 
       // Switch to iframe by id
      driver.switchTo().frame("myFrame");
       // Now we're inside the iframe, so we can locate the input field by its id
       WebElement messageInput = driver.findElement(By.id("message"));
       // Type something in the input field
      messageInput.sendKeys("Hello Learners!!!!");
      driver.switchTo().defaultContent(); 
      
      // Switch to iframe by id
      driver.switchTo().frame("myFrame2");
       // Now we're inside the iframe, so we can locate the input field by its id
       WebElement messageInputframe2 = driver.findElement(By.id("message"));
       // Type something in the input field
      messageInputframe2.sendKeys("Java-Selenium");
      driver.switchTo().defaultContent(); 
      
      // Switch to iframe by id
      driver.switchTo().frame("myFrame3");
       // Now we're inside the iframe, so we can locate the input field by its id
       WebElement messageInputframe3 = driver.findElement(By.id("message"));
       // Type something in the input field
      messageInputframe3.sendKeys("Batch 7");
      driver.switchTo().defaultContent(); 
      
       // Optionally: wait a few seconds to visually confirm
      Thread.sleep(2000);
       // Switch back to main page
      driver.switchTo().defaultContent();
//       driver.quit();
   }
}
