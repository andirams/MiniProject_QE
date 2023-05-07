Feature: Register to Alta-shop Account

    As an user
    I want to register to access alta shop feature
    So that I can login to the website

    Scenario: Register with valid data
        Given I am on the alta-shop login page
        When I go to the alta-shop register page
        And I input correct fullname for register
        And I input correct email for register
        And I input correct password for register
        And I click on the register button
        Then I should be redirected to login page

    Scenario: Register without fill the fullname
        Given I am on the alta-shop login page
        When I go to the alta-shop register page
        And I input nothing in fullname for register
        And I input correct email for register
        And I input correct password for register
        When I click on the register button
        Then I should see the error message

    Scenario: Register without fill the email
        Given I am on the alta-shop login page
        When I go to the alta-shop register page
        And I input correct fullname for register
        And I input nothing in email for register
        And I input correct password for register
        When I click on the register button
        Then I should see the error message

    Scenario: Register without fill the password
        Given I am on the alta-shop login page
        When I go to the alta-shop register page
        And I input correct fullname for register
        And I input correct email for register
        And I input nothing in password for register
        When I click on the register button
        Then I should see the error message

    Scenario: Register with existed email
        Given I am on the alta-shop login page
        When I go to the alta-shop register page
        And I input correct fullname for register
        And I input existed email for register
        And I input correct password for register
        When I click on the register button
        Then I should see the error message