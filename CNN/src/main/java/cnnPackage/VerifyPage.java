package cnnPackage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.Assertion;

public class VerifyPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"breaking-news\"]/div/div/div[2]/span")
    WebElement breakingnews;
    @FindBy(xpath = "//*[@id=\"logo\"]")
    WebElement CNNlogo;
    @FindBy(xpath = "//*[@id=\"homepage1-zone-1\"]/div[2]/div/div[1]/ul/li[1]/article/a/h2")
    WebElement textvalidation;

    public void setnewsdisp(){
        waitUntilVisible(By.xpath("//*[@id=\"homepage1-zone-1\"]/div[2]/div/div[1]/ul/li[1]/article/div/div[1]/a/img"));
    }
    public void setBreakingnews() {
    }

    public void setCNNlogo () {
        if (CNNlogo.isDisplayed()) {
            System.out.println("CNN displayed");
        }else{
            System.out.println("testfield");
        }


    }
    public void setTextvalidation () {
        String st ="Acting defense chief out of confirmation process";
        Assertion assertion = new Assertion();
        assertion.assertEquals("Acting defense chief out of confirmation process",st);

    }
}