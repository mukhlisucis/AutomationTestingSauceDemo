package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class InventoriPage {
    public static WebDriver driver;

    public InventoriPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver ;
    }




    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement basketItem1 ;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
    private WebElement basketItem2;

    @FindBy (xpath = "//a[.='2']")
    private WebElement shoppingCart ;

    @FindBy (xpath = "//button[@id='checkout']")
    private WebElement clickCheckoutButton ;

    public void clickBasket1(){

        basketItem1.click();
}
    public void clickBasket2(){

        basketItem2.click();
    }
    public void clickShoppingCart(){

        shoppingCart.click();
    }

    public void clickCheckout(){
    clickCheckoutButton.click();
    }


}
