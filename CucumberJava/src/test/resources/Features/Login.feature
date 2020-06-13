#Author: shuvajitmandal@gmail.com
@SmokeFeature
Feature: Feauture to test Login Functionality

  @SmokeTest
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on the login button
    Then user is navigated to home page

  #@tag2
  #Scenario Outline	: Check login is successful with valid credentials
  #  Given user is on login page
  #  When user enters <username> and <password>
  #  And clicks on the login button
  #  Then user is navigated to home page

  #  Examples: 
  #    | username  | password |
  #    | name1 		 |     5 		|
  #    | name2 		 |     7 		|
