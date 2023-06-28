
Feature: Submitting forms on the Healthcare page

  Scenario: Submitting form from FAQ block
    Given User navigate to Healthcare page in the FAQ block
    And User click on the Ask your question button in the FAQ block
    And User select Industry in the FAQ form
    And User fills Name field in the FAQ form
    And User fills Email field in the FAQ form
    And User fills Phone field in the FAQ form
    And User fills Comments field in the FAQ form
    And User click on the checkbox in the FAQ form
    And User Click on the Send button in the FAQ form