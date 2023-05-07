Feature: Comment

    As a user
    I want to comment an item
    So that I can give my comment

    Scenario: POST - Post comment
        Given I set POST api endpoints comment
        When I send POST HTTP request comment
        Then I receive valid HTTP response code 200 comment

    Scenario: GET - Get comment with correct endpoints
        Given I set GET api endpoints comment
        When I send GET HTTP request comment
        Then I receive valid HTTP response code 200 comment

    Scenario: Get comment with incorrect endpoints
        Given I set GET api endpoints comment2
        When I send GET HTTP request comment2
        Then I receive valid HTTP response code 404 comment