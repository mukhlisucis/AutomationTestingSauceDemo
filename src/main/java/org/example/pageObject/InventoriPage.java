package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InventoriPage {
    public static WebDriver driver;

    public InventoriPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver ;
    }




    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
    private WebElement basketItem1 ;
    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
    private WebElement basketItem2;

    @FindBy (xpath = "//a[.='2']")
    private WebElement shoppingCart ;

    @FindBy(xpath = "//select[@class='product_sort_container']")
    private WebElement selectContainer ;

    @FindBy (xpath = "//button[@id='checkout']")
    private WebElement clickCheckoutButton ;

    @FindBy (xpath = "//span[@class='title']")
    private WebElement displayLandingPage ;

    @FindBy (xpath = "//div[.='Sauce Labs Onesie']")
    private WebElement displayItem1 ;

    @FindBy (xpath = "//div[.='Test.allTheThings() T-Shirt (Red)']")
    private WebElement displayItem2 ;

    @FindBy (xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
    private WebElement removeItem2 ;

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

    public void selectProductContainer(String sortProductList){
        Select sort = new Select (selectContainer);
        sort.selectByVisibleText(sortProductList);

    }

    public boolean displayLandingPage(){
        displayLandingPage.isDisplayed();
        return true ;

    }
    public boolean displayAllItem(){
        displayItem1.isDisplayed();
        displayItem2.isDisplayed();
        return true ;
    }

    public void setRemoveItem2(){
        removeItem2.click();
    }

}
