Feature:
  Hotel has five stars

  @QA
  Scenario: Find hotels in Paris
    Given I open a web site
    When I enter Paris in search field
    When I set dates to arrive and departure
    When I set resettlement
    When I filter apartments
    When I open founded apartment
    Then I see fifth star icon
