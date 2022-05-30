Feature: Click on Buttons and fetch data
  Scenario: Click On elemens
    Given User on the html page
    When User click on Click Me one ,Click Me Two and Click Me Three
    And verify heading
    And Fetch data of table
    And enter first name and last name
    And Select gender
    And Click on link
    And select dropdown
    Then Click on Submit