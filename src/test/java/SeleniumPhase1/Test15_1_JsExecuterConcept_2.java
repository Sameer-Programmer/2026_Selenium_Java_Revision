package SeleniumPhase1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test15_1_JsExecuterConcept_2 {
    static void main(String[] args){
        // Remember only these 3 primary Methods
        String url =  "https://in.trip.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);
        WebElement checkin = driver.findElement(By.xpath("//label[@for='checkInInput']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)"); // To scroll few Pixles
        js.executeScript("arguments[0].scrollIntoView()",checkin); // scrollIntoView
        js.executeScript("arguments[0].click()",checkin); // click.
        driver.close();

    }
}
