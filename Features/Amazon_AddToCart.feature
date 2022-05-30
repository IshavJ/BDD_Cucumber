Feature: Buy product through amazon
  Scenario: Add product to cart
    Given User need to be on amazon web site
    When user enter product details in search bar and click enter
    And click on product
    And add product to the cart
    Then open Add to cart and verify weather product is added or not

  Scenario: Remove item from cart
   Given Cart is open
    When User delete the added item
    Then verify weather item deleted or not