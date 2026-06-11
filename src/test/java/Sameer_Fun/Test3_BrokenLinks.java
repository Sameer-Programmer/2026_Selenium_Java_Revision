package Sameer_Fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Test3_BrokenLinks {
    static void main(String[] args) throws IOException {
        String url = "https://testautomationpractice.blogspot.com/";
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();

        List<WebElement> links =  driver.findElements(By.tagName("a"));
        int brokenLinksCount = 0;
        for(WebElement link :links) {
            String hrefvalue = link.getAttribute("href");

            if(hrefvalue==null||hrefvalue.isEmpty()){
                continue;
            }else {
                URL url1 = new URL(hrefvalue);
               HttpURLConnection httpURLConnection = (HttpURLConnection) url1.openConnection();
               httpURLConnection.connect();
              int responseCode = httpURLConnection.getResponseCode();

              if(responseCode>=400){
                  brokenLinksCount++;
                  System.out.println("BrokenLinksFound"+"  "+brokenLinksCount+"  "+url1);
              }else {
                 // System.out.println("No Broken Links Found ");
              }
            }

        }

        System.out.println(brokenLinksCount);

        driver.close();
        driver.quit();



    }
}
