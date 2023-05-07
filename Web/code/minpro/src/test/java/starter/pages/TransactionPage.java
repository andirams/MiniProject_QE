package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class TransactionPage extends PageObject {
    private By transactionTitle() {
        return By.xpath("//h1[contains(text(), 'Transactions')]");
    }

    @Step
    public boolean validateOnTransactionPage() {
        return $(transactionTitle()).isDisplayed();
    }

    private By productTransaction() {
        return By.className("v-data-table-header");
    }

    @Step
    public boolean validateProductTransaction() {
        return $(productTransaction()).isDisplayed();
    }
}
