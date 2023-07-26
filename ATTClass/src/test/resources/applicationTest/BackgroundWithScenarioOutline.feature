Feature: Profile feature
Background:
Given user should be at profile page

Scenario Outline: Create profile for user
When user enter firstname as "<firstname>"
And user enters lastname as "<lastname>"
And user enters city name as "<city>"
Then profile should get created

Examples:
| firstname | lastname | city |
| Eder | Mejia | Mexicocity |
|Aron | Severs | Austin |
|Cynthia | White | London |

