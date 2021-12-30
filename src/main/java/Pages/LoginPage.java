package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.security.util.Password;

import javax.xml.xpath.XPath;
import java.security.cert.X509Certificate;

public class LoginPage extends PageBase{


    public LoginPage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy (id = "email")
    public WebElement Email ;

    @FindBy (id = "password")
    public WebElement Password ;

    @FindBy (id = "btn_login kt_login_signin_submit" )
    public  WebElement LogBut ;

    @FindBy(xpath = "//a[text()=\"Shgardi\"]")
    public WebElement shgardiXP;

    @FindBy (id = "error_email_invalid")
     public WebElement EmailInvaled ;

    @FindBy (xpath = "//*[text()=\"Required field\"]")
    public WebElement RequiredPW ;


//    @FindBy (id = "error_email_invalid")
//    public WebElement EmailInvaled ;

    @FindBy (xpath = "//*[contains(text(),\"Wrong password\")]")
    public WebElement WrongPW;

    @FindBy (xpath = "//*[text()=\"Field is not valid\"]")
    public WebElement WrongMail;


    public void insrtmail(String x){
    Email.clear();
    Email.sendKeys(x);
    }

    public void insertPW (String x){
        Password.clear();
        Password.sendKeys(x);
    }

    public void ClickLogin (){
        LogBut.click();
    }

    public String AssrShagardi (){
        return shgardiXP.getText();
    }

    public String AssertWrongPW (){
        return WrongPW.getText();
    }
    public String AssertWrongEmail (){
        return WrongMail.getText();
    }
    public String RequiredPW(String required_field){
        return  RequiredPW.getText();
    }
}
