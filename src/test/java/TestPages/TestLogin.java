package TestPages;

import Pages.LoginPage;
import Pages.PageBase;
import okio.Timeout;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.concurrent.TimeUnit;

public class TestLogin extends TestBase{

    LoginPage loginPage;
@Test (priority = 1)
// Nourmal Login
    public void Tclogin1 (){
     loginPage = new LoginPage(driver);

    loginPage.insrtmail("mohamed.salah@shgardi.app");
    loginPage.insertPW("P@ssw0rd");
    loginPage.ClickLogin();

    Assert.assertEquals(loginPage.AssrShagardi(),"Shgardi");

}

    @Test(priority = 2,enabled = false)
    // Worng UN
    public void TClogin2 () throws InterruptedException {
        loginPage = new LoginPage(driver);

        loginPage.insrtmail("mohamed.nasrshgardieappww");
        loginPage.insertPW("P@ssw0rd");
        loginPage.ClickLogin();
        loginPage.AssertWrongEmail();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);



    }

    @Test (priority = 3,enabled = false)
    // Wring PW
    public void TClogin3 () throws InterruptedException {
        loginPage = new LoginPage(driver);

        loginPage.insrtmail("mohamed.nasr@shgardi.app");
        loginPage.insertPW("P@ssw0rd1234");
        loginPage.ClickLogin();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        Assert.assertEquals(loginPage.AssertWrongPW(),"Wrong password");


    }
    @Test (priority = 4,enabled = false)
    // Password Empty
    public void LoginTC4 () throws InterruptedException {
    loginPage = new LoginPage(driver);
    loginPage.insrtmail("mohamed.nasr@shgardi.ap");
    loginPage.insertPW("");
    loginPage.ClickLogin();
    loginPage.RequiredPW("Required field");

    }
}
