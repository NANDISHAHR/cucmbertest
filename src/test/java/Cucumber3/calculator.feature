Feature: Test calculator
 This file describes calculator functionality
 Scenario: Add two numbers
 Given I entered 50 in the caluclator
 And I press add
 Then I have entered 50 in the calculator
 And I pressed equal
 Then the result should be 100
 
 Scenario: sub two numbers
 Given I entered 30 in the caluclator
 And I press sub
 Then I have entered 20 in the calculator
 And I pressed equal
 Then the result should be 30