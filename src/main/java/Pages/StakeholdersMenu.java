package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StakeholdersMenu extends PageBase{
    public StakeholdersMenu(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath = "//*[text()='Stakeholders']")
    public WebElement StakList;

    public void StakList(){
    StakList.click();
    }


}
