Feature: Search Employee Reports
Scenario: I want to Search Employee report with the help of report name 
Given I am already Logged into OrangeHrm and have opened Reports Pannel
When I enter Valid report name and Click on Search Button
Then I should be able to see searched report with same name 
