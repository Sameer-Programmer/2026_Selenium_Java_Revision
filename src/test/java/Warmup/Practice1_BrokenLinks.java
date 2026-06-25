package Warmup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class Practice1_BrokenLinks {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        int count = 0;
        List<WebElement> elements =driver.findElements(By.tagName("a"));
        for(WebElement element : elements){
           String hrefvalue = element.getAttribute("href");

           if(hrefvalue == null || hrefvalue.isBlank() ) {
               continue;
           }


           URL urllink = new URL(hrefvalue);
          HttpURLConnection con = (HttpURLConnection) urllink.openConnection();
          con.connect();
          int responsecode = con.getResponseCode();
          if(responsecode>=400){
              count++;
              System.out.println(urllink+"         broken");
          }
        }
        System.out.println(count+"           brokenLinks");
        driver.close();

    }
}
