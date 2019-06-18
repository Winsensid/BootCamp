package facebookPackageTest;


import base.CommonAPI;
import facebookPackage.LogIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInTest extends CommonAPI {


   LogIn login;

    @BeforeMethod
    public void init() {
       login = PageFactory.initElements(driver, LogIn.class);
    }

    @Test (priority = 1)
    public void setLogin() {
        login.setLogin();
    }
    @Test(priority = 2)
    public void setLogin2(){
        login.setLogin2();
    }
    @Test
    public void setLogin3(){
        login.setLogin3();
    }


}

