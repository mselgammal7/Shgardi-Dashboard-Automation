package TestPages;

import Pages.MouseHover;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestHover extends TestBase{


     //WebElement menu = driver.findElement(By.id("kt_aside_menu"));
  //   Hover( driver,menu);

     MouseHover MouseHoverobject;
   //  Actions actionobject;

     @Test (priority = 2)
     public void testhover()  {

          MouseHoverobject=new MouseHover(driver);
          driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
          MouseHoverobject.hover(driver, MouseHoverobject.t);
          MouseHoverobject.TDashboardclick();

     }




}
