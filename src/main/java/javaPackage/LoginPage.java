package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends InitialDriver{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="email") private WebElement email;
    @FindBy (id="password") private  WebElement password;
    @FindBy (xpath = "//button[contains(text(),'Sign In')]") private  WebElement loginbt;
    @FindBy (xpath = "//a[contains(text(),'Shgardi')]") private  WebElement footerlink;
    public void insertEmail(String Email)
    {
        email.clear();
        email.sendKeys(Email);
    }
    public void insertPassword(String Password)
    {
        password.clear();
        password.sendKeys(Password);
    }

    public void pressOnLoginbt()
    {
        loginbt.click();
    }
    public String checkloginpage()
    {
        return footerlink.getText();
    }

}
