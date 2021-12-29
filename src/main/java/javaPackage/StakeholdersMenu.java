package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class StakeholdersMenu extends InitialDriver {
    public StakeholdersMenu(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath="(//a//i[@class='kt-menu__link-icon flaticon-users-1 ng-star-inserted'])[1]")
        private WebElement EStakeholders_icon;
    @FindBy (xpath="(//a//i[@class=\'kt-menu__link-icon flaticon2-lorry ng-star-inserted\'])[1]")
    private WebElement EStakeholders_courier_icon;

    @FindBy (xpath = "//h2[text()='Couriers']")
    private WebElement Ecourier_text;

    public void Fclick_on_Stakeholdermenu()
    {
        EStakeholders_icon.click();
    }
    public void Fclick_on_courier()
    {
        EStakeholders_courier_icon.click();
    }

    public String Freturn_courier_text() {
        return Ecourier_text.getText();
    }
}
