package Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test4 {
    public static void main(String[] args) {
//WebDriver driver = new ChromeDriver() ;
        WebDriver driver = new FirefoxDriver();
        String url = "https://testautomationpractice.blogspot.com/";
        driver.get(url);
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL      "+currentURL);
        String TitleOfpage = driver.getTitle();
        System.out.println("Page Title   "+TitleOfpage);
        driver.close();

    }
}
