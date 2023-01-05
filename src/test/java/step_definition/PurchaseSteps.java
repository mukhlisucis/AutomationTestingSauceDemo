package step_definition;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.example.pageObject.CheckInformation;
import org.example.pageObject.InventoriPage;
import org.example.pageObject.LoginPage;
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

    @Given("Sort Name Z to A")
    public void selectSort() throws InterruptedException{
        Select select = new Select(webDriver.findElement(By.xpath("//select[@class='product_sort_container']")));
        select.selectByVisibleText("Name (Z to A)");
        Thread.sleep(3000);
    }
    @And("User pick itemSauce Labs Onesie")
    public void clickItemBasket1() throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickBasket1();
        Thread.sleep(2000);
    }
    @And("User pick item Sauce Labs Fleece Jacket")
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
    @And("Cek items 1 name on cart menu")
    public void cekNameCart1()throws InterruptedException{
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        String namaItem1 = webDriver.findElement(By.xpath("//div[.='Sauce Labs Onesie']")).getText();
        System.out.println(namaItem1);

    }
    @And("Cek items 2 name on cart menu")
    public void cekNameCart2()throws InterruptedException{
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        String namaItem2 = webDriver.findElement(By.xpath("//div[.='Sauce Labs Fleece Jacket']")).getText();
        System.out.println(namaItem2);

    }

    @And("Click button checkout")
    public void clickCheckout()throws InterruptedException{
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        inventoriPage.clickCheckout();
        Thread.sleep(5000) ;
    }
    @And("User input \"(.*)\" as firstName and input \"(.*)\" as lastName and input \"(.*)\" as ZIP code")
    public void inputDataDiri(String firstName, String lastName, String zipCode ) throws InterruptedException {
        CheckInformation isiInformasi = new CheckInformation(webDriver);
        isiInformasi.setFirstName(firstName);
        isiInformasi.setLastName(lastName);
        isiInformasi.setPostalCode(zipCode);
        Thread.sleep(4000) ;
        isiInformasi.setClickContinue();
        Thread.sleep(4000) ;

    }
    @And("Cek total Price")
    public void cekTotalPrice()throws InterruptedException{
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        String totalHarga = webDriver.findElement(By.xpath("//div[@class='summary_total_label']")).getText();
        System.out.println(totalHarga);
        Thread.sleep(4000) ;

    }
    @And("Click button finish")
    public void clickFinish()throws InterruptedException{
        CheckInformation isiInformasi = new CheckInformation(webDriver);
        isiInformasi.setClickFinish();
        Thread.sleep(5000) ;
    }
    @And("verify value THANK YOU FOR YOUR ORDER")
    public void cekValueThanks()throws InterruptedException {
        InventoriPage inventoriPage = new InventoriPage(webDriver);
        String thankYou = webDriver.findElement(By.xpath("//h2[@class='complete-header']")).getText();
        System.out.println(thankYou);
        Thread.sleep(4000);
    }
    @Then("Verify THANK YOU FOR YOUR ORDER displayed")
    public void verivyOrderFinished()throws InterruptedException{
        CheckInformation isiInformasi = new CheckInformation(webDriver);
        isiInformasi.setVerifyOrder();

    }


}
