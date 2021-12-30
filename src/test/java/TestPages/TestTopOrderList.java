package TestPages;

import Pages.TopOrderListPage;
import org.testng.annotations.Test;

public class TestTopOrderList extends TestBase{
    TopOrderListPage TopOrdListP ;

    TestStakeholders stakeholdersobject;
    TestHover MouseHoverobject;
    TestLogin loginPageobject;

    @Test
    public void TCTopOrderList(){

        loginPageobject =new TestLogin();
        loginPageobject.Tclogin1();
        MouseHoverobject =new TestHover();
        MouseHoverobject.testhover();

        TopOrdListP = new TopOrderListPage(driver);
        TopOrdListP.TopOrdList();


    }

}
