Feature: Main Page Website
  These tests will verify the functionality of the main page.

  Scenario: Sign Up For Newsletter
    Given I am on the main page
    When I enter the email address "testing.test@test.com"
    And I click on the submit button
    Then The email save pop-up message appear

  Scenario: Learn The Fundamentals
    Given I am on the main page
    When I click on the Read More button of the fundamental area
    Then The new main page appear

  Scenario: Read Frequently Asked Questions
    Given I am on the main page
    When I click on the Questions button
    Then The main page scroll down to Frequently Asked Questions
    And  I click on the How much does it cost to attend? Question
    Then The answer appear below the question