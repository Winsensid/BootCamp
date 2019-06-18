package cnnPackageTest;

import base.CommonAPI;
import cnnPackage.VerifyPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyPageTest extends CommonAPI {

    VerifyPage pageObject;

    @BeforeMethod
    public  void initi(){
        pageObject= PageFactory.initElements(driver,VerifyPage.class);
    }
    // @Test
    public void setnewdispTest(){

        pageObject.setnewsdisp();
    }
    //@Test
    public void setLogoTest(){
        pageObject.setCNNlogo();
    }
    @Test
    public void setTextvalidationTest(){
        pageObject.setTextvalidation();

    }


}