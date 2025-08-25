package com.example.seleniumAndTestNGDependency;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
 
public class DependencyTestExample {
   WebDriver driver;
 
   @BeforeClass
   public void setUp() {
       driver = new ChromeDriver();
   }
 
   @Test
   public void launchWebsite() {
       driver.get("https://emppage.html");
       String expectedTitle = "Employee Page";
       String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
   }
 
   @Test(dependsOnMethods = {"launchWebsite"})
   public void performLogin() {
       // Simulate login functionality
      System.out.println("Login test running...");
       // e.g., driver.findElement(By.id("login")).click();
   }
 
   @Test(dependsOnMethods = {"performLogin"})
   public void verifyDashboard() {
       // Simulate dashboard verification
      System.out.println("Dashboard verification test running...");
       // e.g., Assert.assertTrue(driver.findElement(By.id("dashboard")).isDisplayed());
   }
 
   @AfterClass
   public void tearDown() {
       driver.quit();
   }
}

