Feature: feature to test the login page
Background:
Given user is on login page
  Scenario Outline: Check login is successful for valid credentials
    
    
 When user enters <username> and <password>
  And click on login button
 Then user navigate to home page

Examples:
|username|password|
|thejomanibavanasi|mounika|