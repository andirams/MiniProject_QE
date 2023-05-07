package starter.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class RegisterPage extends PageObject {

    private By fullnameFieldReg() {
        return By.id("input-29");
    }

    private By emailFieldReg() {
        return By.id("input-32");
    }

    private By passwordFieldReg() {
        return By.id("input-35");
    }

    private By registerButton() {
        return By.className("v-btn--is-elevated");
    }

    private By alertNotification() {
        return By.className("v-alert");
    }

    @Step
    public void inputFullnameReg(String fullnameReg) {
        $(fullnameFieldReg()).type(fullnameReg);
    }

    @Step
    public void inputEmailReg(String emailReg) {
        $(emailFieldReg()).type(emailReg);
    }

    @Step
    public void inputPasswordReg(String passwordReg) {
        $(passwordFieldReg()).type(passwordReg);
    }

    @Step
    public void ClickRegisterButton() {
        $(registerButton()).click();
    }

    @Step
    public boolean showWarningAlert() {
        return $(alertNotification()).isDisplayed();
    }

}
