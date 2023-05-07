Feature: Logout from Alta-shop Account

    As an user
    I want to logout from alta shop account
    After I done purchasing

    Scenario: Logout from account
        Given I am on the alta-shop home page
        And I click user icon
        When I click logout option
        Then I should be redirected back to my alta-shop home page