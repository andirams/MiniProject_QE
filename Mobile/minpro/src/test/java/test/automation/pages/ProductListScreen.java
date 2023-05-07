package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class ProductListScreen extends BasePageObject {
    
    By buttonBeli(){
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[4]");}

    By buttonCart(){
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"1\"]");}
    

    public void clickButtonBeli(){
        click(buttonBeli());
    }

    public void verifyCartAdded(){ 
        Assertions.assertTrue(find(buttonCart()).isDisplayed());
    }

}
