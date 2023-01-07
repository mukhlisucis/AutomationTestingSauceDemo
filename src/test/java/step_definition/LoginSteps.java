package step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private WebDriver webDriver;
    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver ;
    }

    @Given("User open the website sauce demo")
    public void verifyDisplay(){
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.isDisplayed() ;
    }
    @When("User input \"(.*)\" ad userName and input \"(.*)\" as password")
    public void inputCredential(String userName, String password) throws InterruptedException {
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.setUserName(userName) ;
        loginPage.setPassword(password);
        loginPage.clickLogin();
        Thread.sleep(5000);


    }
    @Then("User see error \"(.*)\" on login page")
    public void getErrorText(String errorText){
        LoginPage loginpage = new LoginPage(webDriver);
        Assert.assertEquals(errorText, loginpage.getErrorText());
    }
}
