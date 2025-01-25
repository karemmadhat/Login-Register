package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {


    WebDriver driver;

    //first assertion
    By logout =By.xpath("//button[text()='Log Out']");

    By rehul=By.xpath("//strong[text()='Rahul Shetty']");

    By helloUser =By.xpath("//*[@id=\"root\"]/div/div/div/h2");


    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    //methods
    public boolean IsLogoutDisplayed(){
        boolean result =driver.findElement(logout).isDisplayed();
        return result;
    }
    public boolean MyTextIsDisplayed(){
        boolean result =driver.findElement(rehul).isDisplayed();
        return result;
    }
    public String HelloUserIsDisplayed(){
        String result =driver.findElement(helloUser).getText();
        return result;
    }

}
