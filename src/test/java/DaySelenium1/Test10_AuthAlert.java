package DaySelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test10_AuthAlert {
    static void main(String[] args){
        //injetionProcess
        // Syntax = https://userName:password@the-internet.herokuapp.com/
        String url = "https://the-internet.herokuapp.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(By.linkText("Basic Auth")).click();
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        WebElement congrtasText  =
                driver.findElement(By.xpath("//p[normalize-space()='Congratulations! You must have the proper credentials.']"));
        boolean status = congrtasText.isDisplayed();
        System.out.println(status);
        driver.quit();


    }
}
