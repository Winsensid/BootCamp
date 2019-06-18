package mobilePackageTest;

import base.MobileAPI;
import mobilePackage.MobileClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MobileClassTest extends MobileAPI {

    MobileClass mobileClass;

    @BeforeMethod
    public void init(){
        mobileClass = PageFactory.initElements(appiumDriver, MobileClass.class);
    }

    @Test
    public void cont(){
        appiumDriver.scrollTo("TAP TO CONTINUE").click();
    }
    //@Test
    public void setContinuesTest(){
        mobileClass.setContinues();
    }





}