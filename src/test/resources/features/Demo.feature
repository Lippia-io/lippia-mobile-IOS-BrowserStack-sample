@Regresion
Feature: As a potential client i want to interact with the mobile application

  Scenario: The user starts the Proverbial application, show a text, changes the text color and make a speed test.
    Given Home page is displayed
    When The user taps on Text button 3 times
    Then The text displayed is changed

  @Demo
  Scenario Outline: As a potential client i want to search in the internal app browser
    Given Home page is displayed
    When The user taps on the browser button
    And Search the word <text>
    Then The user verify that results are shown properly
    Examples:
      | text      |
      | Crowdar   |
      | Lippia.io |