package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    private By loginIcon() {
        return By.className("fa-sign-in");
    }

    private By userIcon() {
        return By.className("fa-user");
    }

    private By cartIcon() {
        return By.className("fa-shopping-cart");
    }

    private By transactionOption() {
        return By.xpath("//*[@class='v-list v-sheet theme--light']//*[contains(text(), 'Transaksi')]");
    }

    private By logoutOption() {
        return By.className("fa-sign-in");
    }

    private By productSonyPS5() {
        return By.id("13355");
    }

    private By beliButton() {
        return By.xpath(
                "//div[@id='13355']//button[@class='button-beli ml-3 v-btn v-btn--outlined theme--light v-size--small primary--text']");
    }

    private By detailButton() {
        return By.xpath(
                "//div[@id='13355']//button[@class='button-beli v-btn v-btn--outlined theme--light v-size--small primary--text']");
    }

    private By selectCategoryDropdown() {
        return By.xpath("//*[@class='v-input__slot']//*[@class='v-select__selections']");
    }

    private By gamingCategory() {
        return By.xpath("//*[contains(@id, '-5')]");
    }

    private By gamingCategoryAlert() {
        return By.xpath("//*[@class='v-alert v-sheet theme--light elevation-2 v-alert--border v-alert--border-top']");
    }

    private By clearCategory(){
        return By.className("v-icon--link");
    }

    @Step
    public void openPage() {
        open();
    }

    @Step
    public void clickLoginIcon() {
        $(loginIcon()).click();
    }

    @Step
    public void clickUserIcon() {
        $(userIcon()).click();
    }

    @Step
    public void clickCartIcon() {
        $(cartIcon()).click();
    }

    @Step
    public void clickTransactionOption() {
        $(transactionOption()).click();
    }

    @Step
    public void clickLogoutOption() {
        $(logoutOption()).click();
    }

    @Step
    public boolean validateOnHomePage() {
        return $(userIcon()).isDisplayed();
    }

    @Step
    public boolean validateAlreadyLogout() {
        return $(loginIcon()).isDisplayed();
    }

    @Step
    public boolean validateTheProduct() {
        return $(productSonyPS5()).isDisplayed();
    }

    @Step
    public void clickBeliButton() {
        $(beliButton()).click();
    }

    @Step
    public void clickDetailButton() {
        $(detailButton()).click();
    }

    @Step
    public void clickSelectCategory() {
        $(selectCategoryDropdown()).click();
    }

    @Step
    public void clickGamingCategory() {
        $(gamingCategory()).click();
    }

    @Step
    public boolean validateGamingCategoryAlert() {
        return $(gamingCategoryAlert()).isDisplayed();
    }

    @Step
    public void clickClearCategory() {
        $(clearCategory()).click();
    }

}
