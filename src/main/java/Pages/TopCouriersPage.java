package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopCouriersPage extends PageBase{
    public TopCouriersPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (linkText = "Top Couriers")
    public WebElement TopCouriers ;

    public void TopCourirsPag (){
        TopCouriers.click();
      //  TopCouriers.submit();
    }
    public void TopCourirsSub (){

        TopCouriers.submit();
    }
}
