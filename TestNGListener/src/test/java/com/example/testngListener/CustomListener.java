package com.example.testngListener;

import org.testng.ITestListener;
import org.testng.ITestResult;
 
public class CustomListener implements ITestListener {
 
   public void onTestStart(ITestResult result) {
      System.out.println("Test Started: " + result.getName());
   }
 
   public void onTestSuccess(ITestResult result) {
      System.out.println("Test Passed: " + result.getName());
   }
 
   public void onTestFailure(ITestResult result) {
      System.out.println("Test Failed: " + result.getName());
   }
 
   public void onTestSkipped(ITestResult result) {
      System.out.println("Test Skipped: " + result.getName());
   }
}

