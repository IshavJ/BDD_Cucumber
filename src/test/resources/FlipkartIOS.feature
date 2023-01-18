Feature: Flipkart IOS application

Scenario Outline: Verify add to cart functionality
  Given User launches the application
  #And Selects English as native language
  #And Taps on Skip text link
  Then Verify user lands on homepage
  When User enters the "<item>" into search bar
  Then Verify user lands into Search screen
  When User selects the desired item from the suggestion
  Then Verify user lands on Result screen
  When User selects first item from Result screen
  Then Verify user lands item screen
  #And Taps on search button
#And verify text in search bar
#And verify if item exist
#And select desired item
#And verify if add to cart button is displayed
#And click on add to cart button
#And verify if apply button exist
#And click on place order
#Then verify if login field is displayed
  Examples:
  |item |
  |realme C30 (Lake Blue, 32 GB) (2 GB RAM)|