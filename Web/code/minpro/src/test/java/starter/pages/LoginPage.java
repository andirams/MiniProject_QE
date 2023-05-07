package starter.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class LoginPage extends PageObject {

    private By emailField() {
        return By.id("input-18");
    }

    private By passwordField() {
        return By.id("input-21");
    }

    private By loginButton() {
        return By.className("v-btn--is-elevated");
    }

    private By  alertNotification() {
        return By.className("v-alert");
    }

    private By toolbarTitle() {
        return By.className("v-toolbar__title");
    }

    private By registerLink() {
        return By.xpath("//a[@href='/auth/register']");
    }

    @Step
    public boolean validateOnLoginPage() {
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void inputEmail(String email) {
        $(emailField()).type(email);
    }

    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public boolean incorrectAlert() {
        return $(alertNotification()).isDisplayed();
    }

    @Step
    public void clickLoginButton() {
        $(loginButton()).click();
    }

    @Step
    public void clickToolbarTitle() {
        $(toolbarTitle()).click();
    }

    @Step
    public void clickRegisterLink() {
        $(registerLink()).click();
    }

}
