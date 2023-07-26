Feature: Profile functionality
Scenario: Add profile for a user
Given user should be at homepage
When user clicks on add profile button
And upload the image
Then profile should get added

Scenario: Update profile for a user
Given user should be at homepage
When user clicks on edit link
And update the image
Then profile should get updated

Scenario: Delete profile for a user
Given user should be at homepage
When user clicks on delete profile button
And delete  the image
Then profile should get deleted
