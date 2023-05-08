package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import test.automation.pages.RegisterScreen;
import test.automation.pages.LoginScreen;

public class RegisterSteps {

    LoginScreen loginScreen = new LoginScreen();
    RegisterScreen registerScreen = new RegisterScreen();

    // Scenario Outline: As a user i want to register account with valid data//

    @And("I click text register")
    public void iClickTextRegister() {
        registerScreen.clickTextRegister();
    }

    @And("I input correct fullname in register")
    public void iInputFieldFullname() {
        registerScreen.inputFieldFullName("Firstname Lastname");
    }

    @And("I input correct email in register")
    public void iInputFieldEmail() {
        int length = 15;
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "_-.";
        String email = "";
        String temp = RandomStringUtils.random(length, allowedChars);
        email = temp.substring(0, temp.length() - 9) + "@mail.com";
        registerScreen.inputEmail(email);
    }

    @And("I input correct password in register")
    public void iInputFieldPassword() {
        registerScreen.inputPassword("123123");
    }

    @And("I click register button")
    public void iClickRegisterButton() {
        registerScreen.clickButtonRegister();
    }

    @Then("I get result message in register")
    public void iGet() {
        registerScreen.verifyAlertButton();

    }

    // Scenario Outline: As a user i want to register account with invalid
    // fullname//

    @And("I input invalid fullname in register")
    public void iInputInvalidFieldFullname() {
        registerScreen.inputFieldFullName("someone in the world");
    }

    // Scenario Outline: As a user i want to register account with invalid email//

    @And("I input invalid email in register")
    public void iInputInvalidFieldEmail() {
        registerScreen.inputEmail("stevenjatmikodotemaildotsch");
    }

    @Then("I should be redirected to product list")
    public void validateRegisterSuccess() {
        loginScreen.isDisplayedHeaderProduct();

    }

    // Scenario Outline: As a user i want to register account with invalid
    // password//

    @And("I input invalid password in register")
    public void iInputInvalidFieldPassword() {
        registerScreen.inputPassword("aiueo");
    }

    // Scenario Outline: As a user i want to register account without using email//

    @And("I not input email in register")
    public void iInputEmptyFieldEmail() {
        registerScreen.inputEmail("");

    }

    @Then("I get result empty email message in register")
    public void iGetTheEmptyEmail() {
        loginScreen.verifyAlertEmail();

    }

}
