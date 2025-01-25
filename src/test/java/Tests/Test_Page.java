package Tests;

import Pages.HomePage;
import Pages.ResetLogin;
import Pages.forgot_password;
import Pages.sign_in;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_Page {
    WebDriver driver;

    sign_in s;
    forgot_password fp;
    ResetLogin rl;
    HomePage hp ;



    @BeforeMethod
    public void initialization() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/#");
        driver.manage().window().maximize();


    }

    @Test
    public void login() throws InterruptedException {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        s =new sign_in(driver);
        String MyUser = s.login ("karem" , "123321");
        fp =new forgot_password(driver);
        fp.forgotMypassword("karim" ,"karim123@yahoo.com" ,"0123456789");
        rl =new ResetLogin(driver);
        String TempPassword = rl.getMytempPassword();
        String MyUser_2 =s.login(MyUser ,TempPassword);
        hp =new HomePage(driver);

        //Assertions
        Assert.assertEquals(hp.IsLogoutDisplayed() ,true ,"My first assertion");
        Assert.assertEquals(hp.MyTextIsDisplayed() ,true ,"My Second assertion");
        Assert.assertEquals("Hello" + MyUser +",",hp.HelloUserIsDisplayed() ,"My third assertion");

    }










    @AfterMethod
    public void teardown(){driver.quit();}






}


