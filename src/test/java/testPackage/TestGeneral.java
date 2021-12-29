package testPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class TestGeneral {

    public static WebDriver driver;

    @BeforeTest
    @Parameters({"Browser"})
    public void Declaration(@Optional("chrome") String browsername) {
        if (browsername.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browsername.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://dashboard-dev.shgardi.app/auth/login");
    }

    @AfterTest
    public void closedBrowser() {
        driver.quit();
    }
   /*
   @AfterMethod
   public void closeBrowser()
   {
      driver.quit();
   }

   public void ScreenShootsOnfailure(ITestResult result)
   {
      if (result.getStatus()==ITestResult.FAILURE)
      {

      }
   }*/
}
