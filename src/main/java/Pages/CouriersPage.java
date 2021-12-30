package Pages;

import com.google.errorprone.annotations.Var;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class CouriersPage extends PageBase {

    WebDriver driver;

    public CouriersPage(WebDriver driver) {
        super(driver);
     //   driver1 = driver;
    }

    @FindBy(xpath = "/html/body/kt-base/div/div/kt-aside-left/div/div/div/ul/li[2]/div/ul/li[2]/a/span")
    public WebElement AllCouriers;

    //@FindBy(className = "kt-menu__link-icon flaticon2-lorry ng-star-inserted")
    //public WebElement ClassCouriers;

    @FindBy(xpath = "/html/body/kt-base/div/div/div/div[2]/div/kt-identity/kt-customers-list/div/div[1]/div/h2")
    public WebElement AssertCourierPage;

   // public void AllCouriers1() {

    //    Actions actions = new Actions(driver1);
//        AllCouriers.click();
//    }
//
    public void ClasCouriers () throws InterruptedException {
        //driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        //Actions act = new Actions(driver);
        //act.doubleClick(AllCouriers).perform();
        Thread.sleep(3000);
        AllCouriers.click();
       Thread.sleep(1000);
        AllCouriers.click();
       // String h = 5 ;
    }

    public boolean AssertCouriersP() {
        return AssertCourierPage.getText().contains("Couriers");
    }

}
