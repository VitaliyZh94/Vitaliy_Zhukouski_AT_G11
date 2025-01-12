Feature:
  Heart button become red

  @QA
  Scenario:
    Given I open a site
    When Find booking in Madrid, one month from now, two adults for five days
    When The first and the last hotel in the list add to favorites
    Then Verify, that heart button become red