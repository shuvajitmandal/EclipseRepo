#Author: shuvajitmandal@gmail.com
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
@tag
Feature: Feature to test google search functionality

Scenario: Validate google search is working

  @tag1
  Scenario: Title of your scenario
    Given Browser is open
    And user is on the google search page
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results