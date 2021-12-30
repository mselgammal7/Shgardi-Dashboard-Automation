package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

    public PageBase(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
/*
    public void hover(WebDriver driver, WebElement t) {
        Actions action = new Actions(driver);
        action.moveToElement(t).perform();
    }*/
}
