
Feature: Submitting forms on the Custom Software Development page

  Scenario: Submitting form from CTA-block
    Given User navigate to Custom Software Development page in the CTA-block
    And User click on the Request consultation button
    And User select Industry in the CTA form
    And User fills Name field in the CTA form
    And User fills Email field in the CTA form
    And User fills Phone field in the CTA form
    And User fills Comments field in the CTA form
    And User click on the checkbox in the CTA form
    And User Click on the Send button in the CTA form