package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class sign_in {


    WebDriver driver;
    public sign_in(WebDriver driver){

        this.driver=driver;
    }

    //elements
    By username =By.xpath("//input[@placeholder='Username']");
    By password =By.xpath("//input[@placeholder='Password']");
    By rememberMe =By.xpath("//input[@value='rmbrUsername']");
    By AcceptTerms =By.xpath("//input[@value='agreeTerms']");
    By signIn =By.xpath("//button[text()='Sign In']");
    By forgetPassword =By.xpath("//a[text()='Forgot your password?']");


    //methods
    public String login(String user ,String pass) throws InterruptedException {
        driver.findElement(username).sendKeys(user);
        String MyUser= driver.findElement(username).getAttribute("value");
        driver.findElement(password).sendKeys(pass);
        driver.findElement(rememberMe).click();
        driver.findElement(AcceptTerms).click();
        driver.findElement(signIn).click();
        Thread.sleep(2000);
        driver.findElement(forgetPassword).click();
        Thread.sleep(1000);

        return MyUser;
    }


}
