package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopOrderListPage extends PageBase{

        WebDriver driver1;
    public TopOrderListPage(WebDriver driver) {
        super(driver);

        driver1 = driver;

    }

    @FindBy (linkText = "Top Orderers")
    public WebElement ListName;

    public void TopOrdList(){
        ListName.click();
    }
}
