package Warmup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
       List<WebElement> links = driver.findElements(By.tagName("a"));


       for(WebElement link:links){
        String hrefValue =   link.getAttribute("href");
        if(hrefValue == null || hrefValue.isEmpty()) continue;
        URL url = new URL(hrefValue);
         HttpURLConnection connection  = (HttpURLConnection) url.openConnection();
       int code=  connection.getResponseCode();




          if(code>=400){
              System.out.println("link broken     "+url);
          }else {
              System.out.println("link working fine     "+url);
          }
       }



    }
}
