package Pages;

import jdk.internal.dynalink.linker.LinkerServices;
import okio.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class MouseHover extends PageBase {
//WebDriver driver1;
    public MouseHover(WebDriver driver) {
        super(driver);
    //    driver1 = driver;
    }


    //WebElement Hov = driver.findelement (By.xpath(""));
    @FindBy(id = "kt_aside_menu")
    public WebElement t;

    @FindBy(xpath = "//*[text()='Dashboard']")
    public WebElement Dashboard;

    public String  TDashboardgetText(){
        return Dashboard.getText();
    }

    public void   TDashboardclick(){
         Dashboard.click();
    }
   /*
    public void HoverList (){
        hover(driver,t);
    }*/
    public void hover(WebDriver driver , WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
}
}



