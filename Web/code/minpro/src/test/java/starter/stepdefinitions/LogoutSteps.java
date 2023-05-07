package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LogoutSteps {

    @Steps
    HomePage homePage;

    @Steps
    LoginPage loginPage;

    @Given("I am on the alta-shop home page")
    public void onTheHomePage() {
        homePage.openPage();
        loginPage.inputEmail("someone@mail.com");
        loginPage.inputPassword("123123");
        loginPage.clickLoginButton();
        homePage.validateOnHomePage();
    }

    @And("I click user icon")
    public void clickUserIcon() {
        homePage.clickUserIcon();
    }

    @When("I click logout option")
    public void clickLogoutOption() {
        homePage.clickLogoutOption();
    }

    @Then("I should be redirected back to my alta-shop home page")
    public void validateAlreadyLogout() {
        homePage.validateAlreadyLogout();
    }

}
