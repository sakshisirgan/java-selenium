Feature: Login functionality
 
 Background:
   Given the user is on the login page
 
 Scenario: Successful login
   When the user enters valid credentials
   And clicks the login button
   Then the user should be redirected to the dashboard
 
 Scenario: Failed login
   When the user enters invalid credentials
   And clicks the login button
   Then an error message should be displayed
