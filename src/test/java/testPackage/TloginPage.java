package testPackage;

import javaPackage.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TloginPage extends TestGeneral{

    LoginPage loginPageObject;

    @Test
    public void validEmailAndPassword()
    {
        loginPageObject=new LoginPage(driver);
        loginPageObject.insertEmail("mohamed.nasr@shgardi.app");
        loginPageObject.insertPassword("Qc*team120");
        loginPageObject.pressOnLoginbt();
        Assert.assertEquals(loginPageObject.checkloginpage(),"Shgardi");

    }
}
