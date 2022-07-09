Feature: verify flipkart app

  @App
  Scenario: Verify add to cart functionality
    Given user enters the flipkart app
    When enter item
    And verify text in search bar
    And verify if item exist
    And select desired item
    And verify if add to cart button is displayed
    And click on add to cart button
    And verify if apply button exist
    And click on place order
    Then verify if login field is displayed

  @Web
  Scenario: verifying add to cart functionality
    When user enter text inside search bar
    And click on search button
    And click on item
    Then click on add to cart and perform verifications
