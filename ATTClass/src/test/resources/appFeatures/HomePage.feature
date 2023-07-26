Feature: Homepage functionality
Scenario: validate title
Given User is at landing page
Then page title should conatins "Shopping"

Scenario: Verify cart item
Given User is at landing page
Then cart icon should get displayed

Scenario: Checkout the deals section
Given User is at landing page
When User click on summer section deal

@sanity
Scenario: login to app
Given User is at landing page
When User click on sign in button
And User enters the username as "rushikeshforex@gmail.com"
And User enters password as "rushikeshforex" with Sign in


