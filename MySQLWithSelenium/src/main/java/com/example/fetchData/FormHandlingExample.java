package com.example.fetchData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class FormHandlingExample {
   public static void main(String[] args) {
 
//Load the WebDriver
WebDriver driver = new ChromeDriver();
 
       try {
           // Load the local HTML file
          driver.get("file:///C:/Users/saksh/HTML%20table/elements.html");
 
           // Select radio button (e.g., Male)
           WebElement FemaleRadio = driver.findElement(By.id("female"));
           if (!FemaleRadio.isSelected()) {
              FemaleRadio.click();
           }
 
           // Select checkbox
           WebElement agreeCheckbox = driver.findElement(By.id("agree"));
           if (!agreeCheckbox.isSelected()) {
              agreeCheckbox.click();
           }
 
           // Select dropdown value (India)
           WebElement countryDropdownElement = driver.findElement(By.id("country"));
           Select countryDropdown = new Select(countryDropdownElement);
          countryDropdown.selectByVisibleText("India");
 
           // Print selected country
           WebElement selected = countryDropdown.getFirstSelectedOption();
          System.out.println("Selected Country: " + selected.getText());
 
       } catch (Exception e) {
          e.printStackTrace();
       } finally {
           // Close the browser
          //driver.quit();
       }
   }
}

