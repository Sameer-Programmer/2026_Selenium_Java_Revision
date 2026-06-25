package Warmup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test5_ChromeOptions {
    public static void main(String [] args){


        ChromeOptions options = new ChromeOptions();
      //  options.addArguments("--headless=new");
        options.addArguments("incognito");

        options.setAcceptInsecureCerts(true);
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://testautomationpractice.blogspot.com/");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
