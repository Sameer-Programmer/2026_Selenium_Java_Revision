package Selenium_Java_TestNG_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class DataproviderDemo {

    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//driver.manage().deleteAllCookies();
//driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
    }

    @Test(dataProvider = "dp1")
    void testLogin(String email, String password) throws InterruptedException {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='input-email']"))
                .sendKeys(email);
        driver.findElement(By.xpath("//input[@id='input-password']"))
                .sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Login']"))
                .click();
        Thread.sleep(5000);
        boolean status = driver.findElement(
                By.xpath("//h2[normalize-space()='My Account']")
        ).isDisplayed();

        if (status == true) {
            driver.findElement(
                    By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")
            ).click();

            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }

    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }


    @DataProvider(name = "dp1", indices = {0, 3})
    public Object[][] dataProviderMethod() {

        Object[][] data = {
                {"sameeridea7@gmai.com", "Sam123#"},
                {"shaikbopr@gmal.com", "Fox345"},
                {"sameer@outlook.com", "Tesr567"},
                {"prapoubucowou-8216@yopmail.com", "Sameera105@"},
                {"1", "123.50"},
                {"c", "true"}
        };

        return data;
    }


}

/*
"prapoubucowou-8216@yopmail.com", "Sameera105@"
Sameera105@

Return type of dataProvider is always a TwoDimensional Array of Object type
Because Data might be any thing
 */