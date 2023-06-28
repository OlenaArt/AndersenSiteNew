
Feature: Submitting forms on the Ruby page

  Scenario: Submitting form from CTA-block with photo
    Given User navigate to Ruby page in the CTA-block with photo
    And User click on the Request consultation button in the CTA-block with photo
    And User select Industry in the CTA form with photo
    And User fills Name field in the CTA form with photo
    And User fills Email field in the CTA form with photo
    And User fills Phone field in the CTA form with photo
    And User fills Comments field in the CTA form with photo
    And User click on the checkbox in the CTA form with photo
    And User Click on the Send button in the CTA form with photo