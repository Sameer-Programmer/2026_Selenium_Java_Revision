
package DemoUtilityPackage_BestForLearningExcel_DataProvider_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Step003_TestLogin {

    @Test(
            dataProvider = "LoginData",
            dataProviderClass = Step002_ExcelDataProvider.class
    )

    public void m1(String email, String password)
            throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        try {

            // Launch application
            driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

            driver.manage().window().maximize();

            // Enter email
            driver.findElement(
                    By.xpath("//input[@id='input-email']")
            ).sendKeys(email);

            // Enter password
            driver.findElement(
                    By.xpath("//input[@id='input-password']")
            ).sendKeys(password);

            // Click Login
            driver.findElement(
                    By.xpath("//input[@value='Login']")
            ).click();

            Thread.sleep(5000);

            // Validate My Account page
            boolean status = driver.findElement(
                    By.xpath("//h2[normalize-space()='My Account']")
            ).isDisplayed();

            Assert.assertTrue(status, "My Account Not Visible");

        }

        finally {

            driver.quit();

        }

    }

}

