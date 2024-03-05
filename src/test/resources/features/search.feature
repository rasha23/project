
Feature: Users should be able to search product

@search
  Scenario: Verify user can search any product
    Given the user on the homepage
    When user type "product name"
    Then user should be able to see the product




