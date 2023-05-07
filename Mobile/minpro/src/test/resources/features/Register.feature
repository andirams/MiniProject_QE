Feature: Register
    As a user
    I want to register account
    So that i can success register account


    Scenario Outline: As a user i want to register account with valid data
        Given I am on the product list
        When I click button sign in
        And I click text register
        And I input correct fullname in register
        And I input correct email in register
        And I input correct password in register
        And I click register button
        Then I get result the message

    Scenario Outline: As a user i want to register account with invalid fullname
        Given I am on the product list
        When I click button sign in
        And I click text register
        And I input invalid fullname in register
        And I input correct email in register
        And I input correct password in register
        And I click register button
        Then I get result message in register

    # Scenario Outline: As a user i want to register account with invalid email

    #     Given I am on the product list
    #     When I click button sign in
    #     And I click text register
    #     And I input correct fullname in register
    #     And I input invalid email in register
    #     And I input correct password in register
    #     And I click register button
    #     Then I should be redirected to product list

    Scenario Outline: As a user i want to register account with invalid password
        Given I am on the product list
        When I click button sign in
        And I click text register
        And I input correct fullname in register
        And I input correct email in register
        And I input invalid password in register
        And I click register button
        Then I get result message in register

    Scenario Outline: As a user i want to register account without using email
        Given I am on the product list
        When I click button sign in
        And I click text register
        And I input correct fullname in register
        And I not input email in register
        And I input correct password in register
        And I click register button
        Then I get result empty email message in register