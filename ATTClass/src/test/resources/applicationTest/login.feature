Feature: Login Functionality
Scenario: Login with valid credentials
  Given User is at the login screen
  When User enters username
  And User enters password
  And User clicks on login button
  Then User should get logged in   