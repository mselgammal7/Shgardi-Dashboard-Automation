package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class InitialDriver
{

 public InitialDriver(WebDriver  driver)
 {
     PageFactory.initElements(driver,this);
 }
}
