package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.LoginScreen;


public class LoginSteps {
    
    LoginScreen loginScreen = new LoginScreen();

    //Scenario Outline: As a user i want to login form my account//

    @Given("I am on the product list")
    public void iAmOnTheProductList() {
        loginScreen.isDisplayedHeaderProduct();
    }

    @When("I click button sign in")
    public void iClickButtonSignin() {
        loginScreen.clickButtonSignin();
    }

    @And("I input correct email in login")
    public void iInputFieldEmailInLogin() {
        String email = "andira" + "@gmail.com";
        loginScreen.inputFieldEmail(email);
    }

    @And("I input correct password in login")
    public void iInputFieldPasswordInLogin() {
        String password = "andira123";
        loginScreen.inputFieldPassword(password);
    }

    @And("I click button login")
    public void iClickButtonLogin() {
        loginScreen.clickButtonLogin();
    }

    @Then("I get result the message")
    public void iGetThe() {
        loginScreen.verifyHeaderProduct();
    
    }
        
        
    //Scenario Outline: As a user i want to login with wrong password//
    
    @And("I input incorrect password in login")
    public void iInputIncorrectPasswordInLogin() {
        String password = "abcdef";
        loginScreen.inputFieldPassword(password);

    }

    @Then("I get result the error message")
    public void iGetTheError() {
        loginScreen.verifyAlertButton();
    
    }

    //Scenario Outline: As a user i want to login with wrong email//

    @And("I input incorrect email in login")
    public void iInputIncorrectEmailInLogin() {
        String email = "andirams" + "@mail.com";
        loginScreen.inputFieldEmail(email);
    }

    //Scenario Outline: As a user i want to login with invalid email//

    @And("I input invalid email in login")
    public void iInputInvalidEmailInLogin() {
        String email = "andirams" + "mail.co.long";
        loginScreen.inputFieldEmail(email);
    }

    //Scenario Outline: As a user i want to login without input any fields//
    
    
    @And("I input empty password in login")
    public void iInputEmptyPasswordInLogin() {
        String password = "";
        loginScreen.inputFieldPassword(password);

    }

    @Then("I get result the empty message")
    public void iGetTheEmpty() {
        loginScreen.verifyAlertPassword();
    
    }
}