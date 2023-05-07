Feature: Login to Alta-shop Account

    As an admin
    I want to login to access alta shop feature
    So that I can use the feature of the website

    Scenario: Login with correct credentials
        Given I am on the alta-shop login page
        And I enter correct email
        And I enter correct password
        When I click on the login button
        Then I should be redirected to my alta-shop home page

    Scenario: Login with wrong password
        Given I am on the alta-shop login page
        And I enter correct email
        And I enter incorrect password
        When I click on the login button
        Then I should see the error message

    Scenario: Login with wrong email
        Given I am on the alta-shop login page
        And I enter incorrect email
        And I enter correct password
        When I click on the login button
        Then I should see the error message

    Scenario: Login with invalid email
        Given I am on the alta-shop login page
        And I enter invalid email
        And I enter correct password
        When I click on the login button
        Then I should see the error message

    Scenario: Login without input any fields
        Given I am on the alta-shop login page
        And I enter empty email
        And I enter empty password
        When I click on the login button
        Then I should see the error message