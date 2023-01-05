package step_definition;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
   public static WebDriver webDriver;

   @Before
   public void openBrowser(){
      System.setProperty("webdriver.chrome.driver",
              System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
      webDriver  = new ChromeDriver();
      String appUrl = "https://www.saucedemo.com/";
      webDriver.get(appUrl);
      webDriver.manage().window().maximize();
   }

   @After
   public void closeBrowser(){
      webDriver.quit();
   }



}
