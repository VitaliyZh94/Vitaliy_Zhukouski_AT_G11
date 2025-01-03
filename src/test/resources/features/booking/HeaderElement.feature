Feature: Header element

  @QA
  Scenario: Check that all header elements exist
    Given I open a site
    When Login as registered user
    Then Verify all headers elements exist