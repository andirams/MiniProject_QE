package starter.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class OrderPage extends PageObject {

    private By totalQuantity() {
        return By.id("label-total-quantity");
    }

    private By orderProduct() {
        return By.id("order-13355");
    }

    private By alertOrderEmpty() {
        return By.className("v-alert");
    }

    private By increaseProduct() {
        return By.xpath(
                "//button[@class='v-btn v-btn--icon v-btn--outlined v-btn--round theme--light v-size--default']//*[text()='+']");
    }

    private By reduceProduct() {
        return By.xpath(
                "//button[@class='v-btn v-btn--icon v-btn--outlined v-btn--round theme--light v-size--default']//*[text()='-']");
    }

    private By bayarButton() {
        return By.id("button-bayar");
    }

    @Step
    public boolean validateQuantityIncreased() {
        return $(totalQuantity()).equals(2);
    }

    @Step
    public boolean validateQuantityReduced() {
        return $(totalQuantity()).equals(1);
    }

    @Step
    public boolean validateProductHasAdded() {
        return $(orderProduct()).isDisplayed();
    }

    @Step
    public boolean validateOrderEmpty() {
        return $(alertOrderEmpty()).isDisplayed();
    }

    @Step
    public void clickIncreaseProduct() {
        $(increaseProduct()).click();
    }

    @Step
    public void clickReduceProduct() {
        $(reduceProduct()).click();
    }

    @Step
    public void clickBayarButton() {
        $(bayarButton()).click();
    }

}
