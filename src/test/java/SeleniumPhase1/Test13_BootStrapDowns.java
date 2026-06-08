package SeleniumPhase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test13_BootStrapDowns {
    static void main(String[] args){
        String url = "https://www.facebook.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);

        WebElement createNewAccountElement = driver.findElement(By.xpath("(//div[@role='none']//span[normalize-space()='Create new account'])[1]"));
        createNewAccountElement.click();
        WebElement day = driver.findElement(By.cssSelector("[aria-label='Select day']"));
        day.click();
        WebElement day1 = driver.findElement(By.xpath("(//div[normalize-space()='1'])[1]"));
        day1.click();



    }
}
