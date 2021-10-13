Feature: Add new invalid Employee Report
Scenario: I want to add a new invalid report of an employee
Given I am already logged in OrangeHrm and in Reports tab
When I clicked on Add Button 
Then I have been redirected to Add report page

When I enter invalid Report Name and Display Field

Then New Employee report should not be created