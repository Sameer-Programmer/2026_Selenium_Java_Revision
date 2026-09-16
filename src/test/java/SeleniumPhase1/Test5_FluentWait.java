package SeleniumPhase1;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Test5_FluentWait {
   public static void main(String[] args)  {
  WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); // implicit wait - Global
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        //ExplicitWait

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Data Entry Form']")));
        WebElement nameElement = driver.findElement(By.cssSelector("#name"));
        nameElement.sendKeys("Sameer Doing Automation");

        System.out.println("success");

        //Thread.sleep(10000);

        //FluentWait


        Wait<WebDriver> wait1 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
      WebElement emailElement =  wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#email")));
      emailElement.sendKeys("sameeridea7@gmail.com");
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
