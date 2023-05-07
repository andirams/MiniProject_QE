package starter.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class ProductDetailPage extends PageObject{

    private By ratingDense() {
        return By.className("v-rating--dense");
    }

    @Step
    public boolean validateOnDetailProductPage() {
        return $(ratingDense()).isDisplayed();
    }

}
