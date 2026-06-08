package SeleniumPhase2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class Test1_BrokenLinks {
    static void main(String[] args) throws IOException {

        String url = "https://testautomationpractice.blogspot.com/#";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);


        List<WebElement> list = driver.findElements(By.tagName("a"));
        int brokenLink = 0;
        int count = 0;

        for (WebElement link : list) {
            String hrefAttributeValue = link.getAttribute("href");
            if (hrefAttributeValue == null || hrefAttributeValue.isEmpty()) {
                continue;
            }

            URL linkUrl = new URL(hrefAttributeValue); // converted String in to URL
            HttpURLConnection httpURLConnection = (HttpURLConnection) linkUrl.openConnection(); // establish the connection
            httpURLConnection.connect(); // send thr request

            if (httpURLConnection.getResponseCode() >= 400) {
                count++;
                System.out.println("brokenLink    "+count+"   "+linkUrl);
                brokenLink++;
            } else {
               // System.out.println("Not a BrokenLink");

            }

        }

        System.out.println("BrokenLinks    "+brokenLink);
        driver.close();

    }
}
