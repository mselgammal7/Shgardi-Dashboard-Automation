package TestPages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;

    @BeforeTest
    @Parameters({"Browser"})
    public void starDriver (@Optional("chrome") String browserName ){

        if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if (browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
        // link
        driver.navigate().to("https://dashboard-dev.shgardi.app/auth/login");

        // demo Link
       // driver.navigate().to("Link Demo Hear");

        // Production Link
        // driver.navigate().to("Link Demo Hear");
    }
        @AfterTest

        public void stopDriver() {

            driver.quit();

    }

}
