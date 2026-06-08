package SeleniumPhase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Test1_BrokenLinks {
    static void main(String[] args) throws MalformedURLException {
        String url = "https://testautomationpractice.blogspot.com/#";
        WebDriver driver = new ChromeDriver();
       List<WebElement> list = driver.findElements(By.tagName("a"));

       for(WebElement link :list){
                    String hrefattributeValue = link.getAttribute("href");

                   if(hrefattributeValue==null || hrefattributeValue.isEmpty()){
                       continue;
                   }
                 URL url1 = new URL(hrefattributeValue); // converted


        }

    }
}
