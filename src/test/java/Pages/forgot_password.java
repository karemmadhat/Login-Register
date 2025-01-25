package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class forgot_password {

    WebDriver driver;



    //element
    By name = By.xpath("//input[@type='text'][1]");
    By email =By.xpath("//input[@placeholder='Email']");
    By phone =By.xpath("//input[@type='text'][3]");
    By resetLogin =By.cssSelector("button.reset-pwd-btn");


    public forgot_password(WebDriver driver){

        this.driver=driver;
    }


    //methods
    public void forgotMypassword(String Name ,String Email ,String Phone ) throws InterruptedException {
        driver.findElement(name).sendKeys(Name);
        driver.findElement(email).sendKeys(Email);
        driver.findElement(phone).sendKeys(Phone);
        driver.findElement(resetLogin).click();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Thread.sleep(1000);


    }
}
