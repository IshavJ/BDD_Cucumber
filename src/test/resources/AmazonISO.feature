Feature : Amazon | IOS
  Scenario: Verify user is able to log into amazon application
    Given User launches the Amazon application
    Then Verify user lands on homepage of Amazon
    When User taps on Account tab from bottom bar
    Then Verify user lands on My Account screen
    When User taps on Sign in button
    And Populates email field with valid email
