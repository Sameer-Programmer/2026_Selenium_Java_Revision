package Warmup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class Test1_Basics_Drivermethods {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement e1 =  driver.findElement(By.name("Header"));
        WebElement e2 = driver.findElement(By.id("header"));
        WebElement e3 = driver.findElement(By.linkText("Home"));
        WebElement e4= driver.findElement(By.className("form-control"));

        System.out.println(e1.getText());
        System.out.println(e2.getText());
        System.out.println(e3.getText());
        System.out.println(e4.getText());


        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        String singleWindowID = driver.getWindowHandle();
        System.out.println(singleWindowID);

        driver.findElement(By.id("PopUp")).click();

        Set<String>ids =  driver.getWindowHandles();
        ArrayList <String>list = new ArrayList<>(ids);
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement logo = driver.findElement(By.cssSelector("[alt='company-branding']"));
        wait.until(ExpectedConditions.visibilityOf(logo));
        WebElement orangeHRMUserName = driver.findElement(By.name("username"));
        wait.until(ExpectedConditions.elementToBeClickable(orangeHRMUserName)).sendKeys("Sameer");
        System.out.println(logo.isDisplayed());

        driver.navigate().back();
        WebElement name1 =driver.findElement(By.cssSelector("[placeholder='Enter Name']"));
        System.out.println(name1.isEnabled());
        System.out.println(driver.getCurrentUrl());

        //driver.navigate().to("https://testautomationpractice.blogspot.com/");
        WebElement radioButtonMale = driver.findElement(By.cssSelector("[class='form-check-input'][id='male']"));
        radioButtonMale.click();
        System.out.println(radioButtonMale.isSelected());
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
        driver.navigate().refresh();
        driver.quit();
    }
}
