Feature: Caimpaign functionality

@sanity
Scenario: creation of Caimpaign 
Given user is at caimpaign page
When User clicks on create Caimpaign
And User enters the information
And Use clicks on save button
Then Caimpaign  should get created

@regression
Scenario: scheduling of Caimpaign 
Given user is at caimpaign page
When User clicks on edit Caimpaign
And User enters the sending information
And Use clicks on schedule button
Then Caimpaign  should get scheduled

@functional
Scenario: sent of Caimpaign 
Given user is at caimpaign page
When User clicks on sent Caimpaign
Then User should see sent count