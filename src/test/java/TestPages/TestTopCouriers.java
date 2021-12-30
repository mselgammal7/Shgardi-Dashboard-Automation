package TestPages;

import Pages.TopCouriersPage;
import Pages.TopOrderListPage;
import org.testng.annotations.Test;

public class TestTopCouriers extends TestBase{
    TopCouriersPage TopCourPag;

    TopOrderListPage TopOrdListP ;

    TestStakeholders stakeholdersobject;
    TestHover MouseHoverobject;
    TestLogin loginPageobject;

    @Test
    public void TopCourierPag (){

        loginPageobject =new TestLogin();
        loginPageobject.Tclogin1();
        MouseHoverobject =new TestHover();
        MouseHoverobject.testhover();

        TopOrdListP = new TopOrderListPage(driver);
        TopOrdListP.TopOrdList();


        TopCourPag = new TopCouriersPage(driver);
        TopCourPag.TopCourirsPag();
        //TopCourPag.TopCourirsSub();


    }

}
