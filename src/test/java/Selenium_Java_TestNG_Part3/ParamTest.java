package Selenium_Java_TestNG_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParamTest {
    WebDriver driver;
    WebDriverWait wait;

    @Parameters({"browser"})
    @BeforeClass
    public void setup(String br) {
        switch (br) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("Invalid browser");
                return;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().deleteAllCookies();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(priority = 1)
    void testLogo() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logo = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.cssSelector("img[alt='company-branding']")));
        Assert.assertTrue(logo.isDisplayed());
    }

    @Test(priority = 2)
    void testTitle() {
        Assert.assertEquals(driver.getTitle(), "OrangeHRM");
    }


    @Test(priority = 3)
    void testURL() {
        String appUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        Assert.assertEquals(driver.getCurrentUrl(), appUrl);
    }

    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }

}
