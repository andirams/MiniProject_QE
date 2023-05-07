Feature: Product

    As an user
    I want to add product to cart
    So that i can process the payment

    Scenario: Add to cart by buy a product with login
        Given I already login and go to the alta-shop home page
        And I choose the product
        When I click BELI button from the product
        Then I should see the product in cart

    Scenario: Add to cart by buy a product without login
        Given I go to the alta-shop home page
        And I choose the product
        When I click BELI button from the product
        Then I shouldn't see the product in cart

    Scenario: Adding product from cart page
        Given I go to the alta-shop home page
        And I choose the product
        When I click BELI button from the product
        And I am adding 1 product in order page
        Then I should see that the product has increased

    Scenario: Reducing product from cart page
        Given I go to the alta-shop home page
        And I choose the product
        When I click BELI button from the product
        And I am reducing 1 product in order page
        Then I should see that the product has reduced

    Scenario: View product detail
        Given I go to the alta-shop home page
        And I choose the product    
        When I click DETAIL button from the product
        Then I should see detail of the product