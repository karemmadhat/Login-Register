package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResetLogin {

    WebDriver driver;


    //elements

    By infoMsg =By.xpath("//p[contains(text(),'Please use temporary password')]");
    By gotoLogin =By.cssSelector("button.go-to-login-btn");


    //driver.findElement(By.cssSelector("button.go-to-login-btn")).click();

    public ResetLogin(WebDriver driver){

        this.driver=driver;
    }

    //methods
    public String getMytempPassword() throws InterruptedException {
        String allContent =driver.findElement(infoMsg).getText();
        String password_content =allContent.split("'")[1].split("'")[0];
        driver.findElement(gotoLogin).click();
        Thread.sleep(1000);

        return  password_content;
    }
}
