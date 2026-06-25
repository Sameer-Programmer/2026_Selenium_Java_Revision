package Warmup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test3 {
    static void main(String[] args) throws InterruptedException {

        // Syntax = https://userName:password@the-internet.herokuapp.com/

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebElement e1 = driver.findElement(By.cssSelector("button[id='alertBtn']"));
        e1.click();
        Alert alertref  = driver.switchTo().alert();
        alertref.dismiss();
        //alertref.accept();
        //alertref.sendKeys("");
        //alertref.getText();

        driver.navigate().to("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());
        WebElement e2 = driver.findElement(By.linkText("Basic Auth"));
        e2.click();
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
       WebElement e3 =
               wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Congratulations')]")));
        System.out.println(e3.isDisplayed());




    }
}
