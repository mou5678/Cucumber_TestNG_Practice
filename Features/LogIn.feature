Feature: User able to log in the application

@Smoke
Scenario: User able to log in the application with valid credentials
Given User able to open any browser
And User able to enter the URL "https://www.zoopla.co.uk/"
When User able to click the Sign-in button
And User able to enter userName "deym4346@gmail.com" 
And User able to enter the password "#Sylhet2014@"
And User able to click the Log-in button
Then User able to validate the page title "My Zoopla | Zoopla"