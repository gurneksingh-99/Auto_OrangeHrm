Feature: Reset Searched Pannel
Scenario: I want to Reset the searched results 
Given I Logged into OrangeHrm and have opened Reports Pannel
And I Have searched a report
When I click on Reset Button
Then The searched result should be reset to default view
