Feature: Header element

  //todo

  @QA
  Scenario: Check that all header elements exist
    Given I open web-site
    When Login as registered user
    Then Verify all headers elements exist