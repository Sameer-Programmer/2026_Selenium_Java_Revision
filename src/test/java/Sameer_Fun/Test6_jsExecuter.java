package Sameer_Fun;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test6 {
    static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)");

        WebElement e1 = driver.findElement(By.xpath("//h2[text()='Footer Links']"));
        js.executeScript("arguments[0].scrollIntoView()",e1);
        System.out.println("done");

        WebElement e2= driver.findElement(By.xpath("(//div[@class='widget PageList']//a[text()='Home'])[2]"));
        js.executeScript("arguments[0].click()",e2);
        System.out.println("done2");
    }

}
