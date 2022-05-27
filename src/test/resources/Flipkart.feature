Feature: Checking certain functionalities on Flipkart

  Background:
    Given user browse to the site

#  Scenario: verifying add to cart functionality
#    When user enter text inside search bar
#    And click on search button
#    And click on item
#    Then click on add to cart and perform verifications

  Scenario Outline: verify the search bar functionality
    When user enter the text with "<sheet>" and <rowNum>
    And click on button
    Then verify title

    Examples:
      | sheet  | rowNum |
#      | Sheet1 | 1      |
      | Sheet1 | 2      |
#      | Sheet1 | 3      |
