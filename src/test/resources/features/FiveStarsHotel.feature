Feature:
  Hotel has five stars

  @QA
  Scenario: Find hotels in Paris
    Given I open a site
    When I enter Paris in search field
    When I set dates to arrive and departure
    When I set resettlement
    Then I see list of hotels
