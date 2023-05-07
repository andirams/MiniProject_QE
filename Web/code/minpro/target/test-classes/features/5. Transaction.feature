Feature: Transaction

    As an user
    I want to see transaction that I made
    So that I can decide what item will I buy

    Scenario: View Transaction
        Given I already login and go to the alta-shop home page
        When I click user icon
        And I click transaction option
        Then I am on the transaction page

    Scenario: View transaction without login
        Given I go to the alta shop home page
        When I click on the login icon
        Then I redirected to login page

    Scenario: Pay the product we've added to cart
        Given I already login and go to the alta-shop home page
        When I click BELI button from the product
        And I click cart icon
        When I click BAYAR button
        Then I can see the transaction

    Scenario: Failed to pay when user hasn't login yet
        Given I go to the alta shop home page
        When I click BELI button from the product
        And I click cart icon
        When I click BAYAR button
        Then I redirected to login page