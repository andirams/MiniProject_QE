package starter.stepdefinitions;

import org.apache.commons.lang3.RandomStringUtils;

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
        registerPage.inputFullnameReg("Someone In The World");
    }

    @And("I input correct email for register")
    public void inputEmailReg() {
        int length = 15;
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "_-.";
        String email = "";
        String temp = RandomStringUtils.random(length, allowedChars);
        email = temp.substring(0, temp.length() - 9) + "@mail.com";
        registerPage.inputEmailReg(email);
    }

    @And("I input correct password for register")
    public void inputPasswordReg() {
        registerPage.inputPasswordReg("someone123");
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
