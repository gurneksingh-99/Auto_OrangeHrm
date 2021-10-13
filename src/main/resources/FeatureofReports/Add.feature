Feature: Add new Employee Report
Scenario: I want to add a new report of an employee
Given I am already logged into OrangeHrm and in Reports tab
When I click on Add Button 
Then I should be redirected to Add report page

When I enter Report Name and Display Field

Then New Employee report should be created