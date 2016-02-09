@mathematician
Feature: Simple calculator
  In order to simplify my calculations
  As a mathematician
  I want to perform simple calculations using a calculator app.

  Scenario: Calculations for integer input.
    Given a simple calculator
    When I input the numbers and perform calculation
      | numbers   | operation |
      | 1,2,3,4,5 | add       |
      | 100,1,2,3 | subtract  |

    Then I should see the results as "15,94"


