package SeleniumPhase1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Test31_incognitoMode {
  public   static void main(String[] args) throws InterruptedException {
        String url = "https://testautomationpractice.blogspot.com/#";
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
      options.setExperimentalOption("excludeSwitches"
              ,new String[]{"enable-automation"});

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(5000);
        driver.quit();
    }
}
