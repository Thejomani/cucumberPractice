Feature: testing the swag labs application



Scenario Outline: validating the app with username and password

Given user is on Swag labs login page
When user gives valid <username> and <password> 
And click on login button in swag labs
Then user should  navigate to application home page

Examples:
|username|password|
|standard_user|secret_sauce|