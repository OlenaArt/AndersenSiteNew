
Feature: Submitting forms on the About Us page

  Scenario: Submitting form from block with Contact form in the Footer
    Given User navigate to Mobile page
    And User select Industry
    And User fills Name field
    And User fills Email field
    And User fills Phone field
    And User fills Comments field
    And User Click on the Send button
    And User see A successful message