@chef
Feature: Best Ketchups
  In order to flavour up my dishes
  As a chef
  I want to look for the best ketchup in the available in the market
  So that I want to flavour up my dishes.

  Scenario: Homemade ketchups are shown in results.
    Given Im on google.com page
    When I search for "tasty ketchup"
    Then I should see "homemade ketchup" shown on my search results

  Scenario: Fruity ketchups are shown in results.
    Given Im on google.com page
    When I search for "tasty ketchup"
    Then I should see "homemade ketchup" shown on my search results


