Feature: Links clickable or not
  Background:
    Given user on iink
    When user navigate free e book and click on it

  Scenario: Verify Free ebook link

    Then verify that user should be ebook page and close website


  Scenario:user click on water fall model
    Then user click on water fall model
    And verify that he is on the another web page
