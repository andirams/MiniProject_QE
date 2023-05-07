package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.RegisterPage;

public class RegisterSteps {

    @Steps
    LoginPage loginPage;

    @Steps
    RegisterPage registerPage;

    // Positive

    @When("I go to the alta-shop register page")
    public void clickLoginButton() {
        loginPage.clickRegisterLink();
    }

    @And("I input correct fullname for register")
    public void inputFullnameReg() {
        registerPage.inputFullnameReg("  ");
    }

    @And("I input correct email for register")
    public void inputEmailReg() {
        registerPage.inputEmailReg("sesorang123690");
    }

    @And("I input correct password for register")
    public void inputPasswordReg() {
        registerPage.inputPasswordReg("  ");
    }

    @And("I click on the register button")
    public void ClickRegisterButton() {
        registerPage.ClickRegisterButton();
    }

    @Then("I should be redirected to login page")
    public void validateOnLoginPage() {
        loginPage.validateOnLoginPage();
    }

    // Negative

    @And("I input nothing in fullname for register")
    public void inputInvalidFullnameReg() {
        registerPage.inputFullnameReg("");
    }

    @And("I input nothing in email for register")
    public void inputInvalidEmailReg() {
        registerPage.inputEmailReg("");
    }

    @And("I input nothing in password for register")
    public void inputInvalidPasswordReg() {
        registerPage.inputPasswordReg("");
    }

    @And("I input existed email for register")
    public void inputExistedEmailReg() {
        registerPage.inputEmailReg("andira@gmail.com");
    }

}
