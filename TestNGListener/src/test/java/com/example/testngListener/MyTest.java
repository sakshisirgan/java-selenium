package com.example.testngListener;

import org.testng.SkipException;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
 
@Listeners(CustomListener.class)
public class MyTest {
 
   @Test
   public void testSuccess() {
       System.out.println("Executing testSuccess...");
   }

   @Test
   public void testFail() {
      System.out.println("Executing testFail...");
       assert false;
   }
   
   @Ignore
   @Test
   public void testIgnored() {
       System.out.println("This test will be ignored...");
   }
   
//   @Test(enabled = false)
//   public void ignoredTest() {
//       System.out.println("This test will be ignored (skipped).");
//   }
   
   @Disabled// same as @Ignore in JUnit 4
   @Test
   void testDisabled() {
       System.out.println("This test is DISABLED and will be skipped");
   }
   
   @Test
   public void testSkip() {
       System.out.println("Skipping this test...");
       throw new SkipException("Skipping because condition not met");
   }
}
