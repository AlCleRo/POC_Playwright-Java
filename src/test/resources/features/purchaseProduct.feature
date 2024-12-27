@regression
Feature: Purchase a product

  @Purchase
  Scenario Outline: Purchase a product with login
    Given the user purchase an item "<item>" with a quantity "<quantity>"
    And sign in filling his credentials
    When the user confirms the order with cash on delivery as payment method
    Then the homepage is displayed with message "Your Order Has Been Processed!"
    Examples:
      | item               | quantity |
      | Samsung Galaxy Tab | 2        |
      | Beloved            | 3        |