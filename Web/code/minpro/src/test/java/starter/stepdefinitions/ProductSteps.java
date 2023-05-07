package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;
import starter.pages.OrderPage;
import starter.pages.ProductDetailPage;

public class ProductSteps {

    @Steps
    HomePage homePage;

    @Steps
    LoginPage loginPage;

    @Steps
    OrderPage orderPage;

    @Steps
    ProductDetailPage productDetailPage;

    /// Positive

    @Given("I already login and go to the alta-shop home page")
    public void onTheHomePage() {
        homePage.openPage();
        loginPage.inputEmail("someone@mail.com");
        loginPage.inputPassword("123123");
        loginPage.clickLoginButton();
        homePage.validateOnHomePage();
    }

    @And("I choose the product")
    public void chooseTheProduct() {
        homePage.validateTheProduct();
    }

    @When("I click BELI button from the product")
    public void clickBeliButton() {
        homePage.clickBeliButton();
    }

    @Then("I should see the product in cart")
    public void validateProductHasAdded() {
        homePage.clickCartIcon();
        orderPage.validateProductHasAdded();
    }

    @Given("I go to the alta-shop home page")
    public void goToHomePage() {
        loginPage.clickToolbarTitle();
    }

    @Then("I shouldn't see the product in cart")
    public void validateOrderEmpty() {
        homePage.clickCartIcon();
        orderPage.validateOrderEmpty();
    }

    @And("I am adding 1 product in order page")
    public void clickIncreaseProduct() {
        orderPage.clickIncreaseProduct();
    }

    @Then("I should see that the product has increased")
    public void validateQuantityIncreased() {
        orderPage.validateQuantityIncreased();
    }

    @And("I am reducing 1 product in order page")
    public void clickReducedProduct() {
        orderPage.clickReduceProduct();
    }

    @Then("I should see that the product has reduced")
    public void validateQuantityReduced() {
        orderPage.validateQuantityReduced();
    }

    @When("I click DETAIL button from the product")
    public void clickDetailButton() {
        homePage.clickDetailButton();
    }

    @Then("I should see detail of the product")
    public void validateOnDetailProductPage() {
        productDetailPage.validateOnDetailProductPage();
    }

}