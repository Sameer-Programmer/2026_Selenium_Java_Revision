package DaySelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.ByteBuffer;
import java.time.Duration;

public class Test5 {
    static void main(String[] args)  {
        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Fluent


        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);  // ✅ no collection needed

        driver.close();
        driver.quit();


    }
}


/*
For example, if we set timeout as 30 seconds and polling as 5 seconds,
 it will check the condition every 5 seconds for up to 30 seconds.
 If the condition is met, it moves on. If not, it throws a TimeoutException."

 Definition

Fluent wait allows:

Total timeout
Polling frequency
Ignoring exceptions

Polling means:

How frequently Selenium checks the condition.
 */