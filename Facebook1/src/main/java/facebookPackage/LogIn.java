package facebookPackage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn extends CommonAPI {

    @FindBy(id = "email")
    WebElement login;

    @FindBy(id = "pass")
    WebElement login2;

    @FindBy(id = "u_0_a")
    WebElement login3;

    public void setLogin() {
        login.sendKeys("userame");
    }
    public void setLogin2(){
        login2.sendKeys("password");
    }
    public void setLogin3(){
        login3.click();
    }

}
