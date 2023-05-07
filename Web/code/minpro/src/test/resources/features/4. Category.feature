Feature: Category

    As an user
    I want to filter by Category
    So that I can see the spesific product

    Scenario: Select category
        Given I go to the alta shop home page
        And I click select category dropdown
        When I click gaming category
        Then I should be redirected to gaming category product

    Scenario: Clear category
        Given I go to the alta shop home page
        And I click select category dropdown
        When I click gaming category
        And I click clear category
        Then I should be redirected back to my alta-shop home page