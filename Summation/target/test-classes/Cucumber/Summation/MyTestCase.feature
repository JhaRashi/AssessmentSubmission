#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Summation Validation
@tag
Scenario Outline: Validate Summation
  Given My data is ready
  When My data is <r1>, <r2>, <r3>
  Then The summation of <r1>, <r2>, and <r3> is <valid>

Examples:
  | r1 | r2 | r3 | valid   |
  | 1  | 2  | 3  | valid   |
  | 5  | 4  | 9  | valid   |
  | 7  | 8  | 7  | invalid |
