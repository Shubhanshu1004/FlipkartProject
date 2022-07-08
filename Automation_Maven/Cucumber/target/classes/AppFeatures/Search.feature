Feature: Amazon Search

  Scenario: Search a product
    Given I have a search field on the Amazon Page
    When I search for a product with name "Apple MacBook Pro" and price 200
    Then Product with name "Apple MacBook Pro" should be displayed
    Then Order id is 12345 and username is "Shubhanshu"