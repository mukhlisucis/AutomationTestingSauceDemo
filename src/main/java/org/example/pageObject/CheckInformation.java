package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckInformation {
    public static WebDriver driver;

    public CheckInformation(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id='first-name']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='last-name']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    private WebElement postalCode ;

    @FindBy(id ="continue" )
    private WebElement clickContinue;

    @FindBy(id = "finish")
    private WebElement clickFinish;

    @FindBy(xpath = "//h2[@class='complete-header']")
    private WebElement verifyOrder ;
    public void setFirstName(String firstNameUser){

        firstName.sendKeys(firstNameUser);
    }
    public void setLastName(String lastNameUser){

        lastName.sendKeys(lastNameUser);
    }

    public void setPostalCode(String postalCodeUser){

        postalCode.sendKeys(postalCodeUser);
    }
    public void setClickContinue(){
        clickContinue.click();
    }

    public void setClickFinish(){
        clickFinish.click();
    }

    public boolean setVerifyOrder(){
        verifyOrder.isDisplayed();
        return true ;
    }


}