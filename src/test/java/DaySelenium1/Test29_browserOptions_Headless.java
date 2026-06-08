package DaySelenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Test29_browserOptions {
    static void main(String[] args){

        /*
        //Options class
       by Uing these Option class we can controll  Settings of the browser
         */
        String url = "https://testautomationpractice.blogspot.com/#";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);
        System.out.println(driver.getTitle());
        driver.quit();


    }
}
