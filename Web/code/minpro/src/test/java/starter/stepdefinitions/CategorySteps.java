package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;
import starter.pages.ProductDetailPage;

public class CategorySteps {

    @Steps
    HomePage homePage;

    @Steps
    LoginPage loginPage;

    @Steps
    ProductDetailPage productDetailPage;

    @Given("I go to the alta shop home page")
    public void goToHomePage() {
        homePage.openPage();
        loginPage.clickToolbarTitle();
    }

    @And("I click select category dropdown")
    public void clickSelectCategory() {
        homePage.clickSelectCategory();
    }

    @When("I click gaming category")
    public void clickGamingCategory() {
        homePage.clickGamingCategory();
    }

    @Then("I should be redirected to gaming category product")
    public void validateOnGamingCategoryProduct() {
        homePage.validateGamingCategoryAlert();
    }

    @And("I click clear category")
    public void clickClearCategory() {
        homePage.clickClearCategory();
    }

}
