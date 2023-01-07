package step_definition;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.CheckInformation;
import org.example.pageObject.InventoriPage;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PurchaseSteps {
    private WebDriver webDriver;

    public PurchaseSteps(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @When("User sort Name Z to A")
    public void selectProductContainer()throws InterruptedException{
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        String a = "Name (Z to A)";
        inventoriPage.selectProductContainer(a);
        Thread.sleep(3000);
    }
    @And("User pick itemSauce Labs Onesie")
    public void clickItemBasket1() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickBasket1();
        Thread.sleep(2000);
    }
    @And("User pick item Test.allTheThings T-Shirt Red")
    public void clickItemBasket2() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickBasket2();
        Thread.sleep(2000);
    }

    @And("User click shopping cart")
    public void clickShoppingCart() throws InterruptedException{
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickShoppingCart();
        Thread.sleep(5000);
    }

    @Then ("Verify All item")
    public void verifyAllItem(){
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertTrue(inventoriPage.displayAllItem());
    }

    @And("Remove item 2 T-Shirt Red")
    public void removeItem2() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.setRemoveItem2();
        Thread.sleep(3000);
    }

    @And("Click button checkout")
    public void clickCheckout()throws InterruptedException{
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickCheckout();
        Thread.sleep(5000) ;
    }
    @Given("User input \"(.*)\" as firstName and input \"(.*)\" as lastName and input \"(.*)\" as ZIP code")
    public void inputDataDiri(String firstName, String lastName, String zipCode ) throws InterruptedException {
        CheckInformation isiInformasi = new CheckInformation(webDriver);
        isiInformasi.setFirstName(firstName);
        isiInformasi.setLastName(lastName);
        isiInformasi.setPostalCode(zipCode);
        Thread.sleep(4000) ;
        isiInformasi.setClickContinue();
        Thread.sleep(4000) ;

    }
    @Then ("verify display item total")
    public void displayItemTotal(){
        CheckInformation itemTotal = new CheckInformation(webDriver);
        Assert.assertTrue(itemTotal.displayitemTotal());
    }
    @Then ("verify display Tax")
    public void displayTax(){
        CheckInformation totalTax = new CheckInformation(webDriver);
        Assert.assertTrue(totalTax.displayTax());
    }
    @Then ("verify display Total Payment")
    public void displayTotalPayment(){
        CheckInformation totalPayment = new CheckInformation(webDriver);
        Assert.assertTrue(totalPayment.displayTotalPayment());
    }


    @And("Click button finish")
    public void clickFinish()throws InterruptedException{
        CheckInformation isiInformasi = new CheckInformation(webDriver);
        isiInformasi.setClickFinish();
        Thread.sleep(5000) ;
    }
    @Then("verify value THANK YOU FOR YOUR ORDER")
    public void cekValueThanks()throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        String thankYou = webDriver.findElement(By.xpath("//h2[@class='complete-header']")).getText();
        System.out.println(thankYou);
        Thread.sleep(4000);
    }
    @And("Verify THANK YOU FOR YOUR ORDER displayed")
    public void verivyOrderFinished()throws InterruptedException{
        CheckInformation isiInformasi = new CheckInformation(webDriver);
        isiInformasi.setVerifyOrder();

    }
    @Then ("verify display landing page")
    public void verifyLandingPage(){
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        Assert.assertTrue(inventoriPage.displayLandingPage());
    }


}
