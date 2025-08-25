package com.example.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class SeleniumLog4jExample {
   private static final Logger logger = LogManager.getLogger(SeleniumLog4jExample.class);
 
   public static void main(String[] args) {
      logger.info("Starting the Selenium test");
      WebDriver driver = new ChromeDriver();
      logger.info("Chrome browser launched");
 
       try {
          driver.get("https://abc.com");
          logger.info("Navigated to abc.com");
 
           String pageTitle = driver.getTitle();
          logger.info("Page title is: " + pageTitle);
 
          
driver.findElement(By.name("q")).sendKeys("Log4j2 in Selenium");
 
       } catch (WebDriverException e) {
          logger.error("An error occurred during the test", e);
       } finally {
          driver.quit();
          logger.info("Browser closed");
       }
   }
}
