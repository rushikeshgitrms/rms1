Feature: Registration functionality
Scenario: Creation of account for a user
Given User should be at registration page
When User enters the following information
| Erin | Smith | erinsmith@gmail.com | 9988776655 |
| Robert | White | robertwhite@gmail.com | 5566778899 |
And User clicks on submit button
Then User gets created
