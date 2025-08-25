package com.example.testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestWithTestNGFramework {

    WebDriver driver;
    
    @BeforeClass
    public void testSetup() {
        try {
            System.out.println("Setting up ChromeDriver...");
            System.setProperty("webdriver.chrome.driver", "\"C:\\Users\\saksh\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe\"");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            System.out.println("Driver setup successful!");
        } catch (Exception e) {
            e.printStackTrace();y
        }
    }


    @BeforeMethod
    public void openBrowser() {
        driver.get("https://www.browserstack.com/");
        System.out.println("Opening BrowserStack homepage...");

        // ✅ Locator updated (signup button changed on BrowserStack)
        driver.findElement(By.id("signupModalProductButton")).click();
        System.out.println("Signup button clicked. Current URL: " + driver.getCurrentUrl());
    }

    @Test(description = "This method validates the sign-up functionality")
    public void signUp() {
        System.out.println("Filling signup form...");

        // ✅ Updated locators for BrowserStack Signup form
        driver.findElement(By.id("user_full_name")).sendKeys("Test User");
        driver.findElement(By.id("user_email_login")).sendKeys("testuser@example.com");
        driver.findElement(By.id("user_password")).sendKeys("Password123");

        // Accept terms
        driver.findElement(By.name("terms_and_conditions")).click();

        // Click submit
        driver.findElement(By.id("user_submit")).click();

        System.out.println("Sign-up form submitted.");
    }

    @AfterMethod
    public void postSignUp() {
        System.out.println("AfterMethod: Current URL is " + driver.getCurrentUrl());
    }

    @AfterClass
    public void afterClass() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed.");
        }
    }
}
