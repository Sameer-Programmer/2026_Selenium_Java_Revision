package DataproviderConcept;

import DataproviderConcept.UtilityPackage.DataProvider_UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test1 {


    @Test(dataProvider = "LoginData1", dataProviderClass = DataProvider_UtilityClass.class)
    public void m1 (String userName, String password){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
        WebElement myAccountElement = driver.findElement(By.xpath("//span[normalize-space() = 'My Account']"));
        WebElement loginElement = driver.findElement(By.xpath("  //a[normalize-space() = 'Login']"));

        myAccountElement.click();
        loginElement.click();


        WebElement emailAddressElement = driver.findElement(By.cssSelector("[name='email']"));
        WebElement passwordElement = driver.findElement(By.cssSelector("[name='password']"));
        WebElement submitButtonElement = driver.findElement(By.cssSelector("[type='submit']"));

        emailAddressElement.sendKeys(userName);
        passwordElement.sendKeys(password);
        submitButtonElement.click();




        WebElement headingElement = driver.findElement(By.xpath(" //div[@id='content']/h2[normalize-space()='My Account']"));


        if(headingElement.isDisplayed()){
            Assert.assertTrue(true);
        }else {
            Assert.fail();
        }

        driver.close();

    }



}
