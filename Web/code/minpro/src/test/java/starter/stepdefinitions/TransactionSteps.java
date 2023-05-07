package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;
import starter.pages.OrderPage;
import starter.pages.TransactionPage;

public class TransactionSteps {

    @Steps
    HomePage homePage;

    @Steps
    LoginPage loginPage;

    @Steps
    OrderPage orderPage;

    @Steps
    TransactionPage transactionPage;

    /// Positive

    @When("I click transaction option")
    public void clickTransactionOption() {
        homePage.clickTransactionOption();
    }

    @Then("I am on the transaction page")
    public void validateOnTransactionPage() {
        transactionPage.validateOnTransactionPage();
    }

    @And("I click cart icon")
    public void clickCartIcon() {
        homePage.clickCartIcon();
    }

    @When("I click BAYAR button")
    public void clickBayarButton() {
        orderPage.clickBayarButton();
    }

    @Then("I can see the transaction")
    public void validateProductTransaction() {
        transactionPage.validateProductTransaction();
    }

    /// Negative

    @When("I click on the login icon")
    public void clickLoginIcon() {
        homePage.clickLoginIcon();
    }

    @Then("I redirected to login page")
    public void validateOnLoginPage() {
        loginPage.validateOnLoginPage();
    }
}
