package SeleniumPhase1;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test32_ShadowDom {
    static void main(String[] args) {
        String url = "https://dev.automationtesting.in/shadow-dom";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);
        SearchContext shadowRoot =
                driver.findElement(By.cssSelector("div[class='MuiBox-root css-13o7eu2'][id='shadow-root']"))
                        .getShadowRoot(); // we are extracting the shadowHost and then calling shadowRoot
        shadowRoot.findElement(By.cssSelector("#shadow-element"));

    }
}
