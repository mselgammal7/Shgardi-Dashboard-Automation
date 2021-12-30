package TestPages;


import Pages.StakeholdersMenu;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class TestStakeholders extends TestBase{
    StakeholdersMenu StakList;
    @Test (priority = 3)
    public void  TCStackholder (){
        StakList= new StakeholdersMenu(driver);
        StakList.StakList();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

    }
}



