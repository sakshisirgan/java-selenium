Feature: User Login
 
 Scenario Outline: Successful login with valid credentials
   Given the user is on the login page
   When the user enters username "<username>" and password "<password>"
   Then the user should see the welcome message "<message>"
   Examples:
     | username | password | message            |
     | user1    | pass1   | Welcome user1!     |
     | user2    | pass2   | Welcome user2!     |
