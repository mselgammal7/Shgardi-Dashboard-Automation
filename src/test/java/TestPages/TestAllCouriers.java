package TestPages;

import Pages.CouriersPage;
import Pages.StakeholdersMenu;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestAllCouriers extends TestBase{
    CouriersPage AllCouriers;
    TestStakeholders stakeholdersobject;
    TestHover MouseHoverobject;
    TestLogin loginPageobject;
    @Test (priority = 4)
    public void AllCouriersMethod() throws InterruptedException {
        loginPageobject =new TestLogin();
        loginPageobject.Tclogin1();
        MouseHoverobject =new TestHover();
        MouseHoverobject.testhover();
        stakeholdersobject=new TestStakeholders();
        stakeholdersobject.TCStackholder();
        AllCouriers = new CouriersPage(driver);
        AllCouriers.ClasCouriers();
       // AllCouriers.ClassCouriers();
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
        Assert.assertTrue(AllCouriers.AssertCouriersP());




    }
}
