package SeleniumPhase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Test17_WebTable_Checkbox {
    static void main(String[] args) throws InterruptedException {

        String url = "https://testautomationpractice.blogspot.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);

        List<WebElement> pages =
                driver.findElements(By.xpath("//ul[@id='pagination']//li"));

        for(int i = 0; i < pages.size(); i++) {

            // Re-locate pages after page refresh
            pages = driver.findElements(By.xpath("//ul[@id='pagination']//li"));
            pages.get(i).click();

            // Re-locate checkboxes on the current page
            List<WebElement> checkboxes =
                    driver.findElements(By.cssSelector("#productTable input[type='checkbox']"));

            for(WebElement checkbox : checkboxes) {
                checkbox.click();
            }
        }

        Thread.sleep(15000);
        driver.quit();
    }
}