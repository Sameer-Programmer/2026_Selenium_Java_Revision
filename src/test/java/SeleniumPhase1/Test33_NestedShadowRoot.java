package SeleniumPhase1;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class Test33_NestedShadowRoot {
    public static void main(String[] args) {
       /*
       For the Nested Shadow Elements we have Follow the Up to Down
          First get the shadow root of Parent then we can go th the child
          From ShadowHost we have ge the Shadow Root

          VVP
          | Object                     | Type          |
| -------------------------- | ------------- |
| Driver                     | WebDriver     |
| Shadow Host                | WebElement    |
| Shadow Root                | SearchContext |
| Element inside Shadow Root | WebElement    |


        */

        String url = "https://dev.automationtesting.in/shadow-dom";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get(url);

        WebElement shadowHostparent = driver.findElement(By.cssSelector(".MuiBox-root[id='shadow-root']"));
        SearchContext shadowRootParent = shadowHostparent.getShadowRoot();
        System.out.println("ShadowRootParentFound");

        SearchContext shadowRootchild = shadowRootParent.findElement(By.cssSelector("#inner-shadow-dom")).getShadowRoot();
        shadowRootchild.findElement(By.cssSelector("#nested-shadow-element")).click();
        System.out.println("Success");
        driver.close();

    }
}

/*
Driver
  |
  ↓
Shadow Host (WebElement)
  |
  ↓ getShadowRoot()
Parent Shadow Root (SearchContext)
  |
  ↓
Child Shadow Host (WebElement)
  |
  ↓ getShadowRoot()
Child Shadow Root (SearchContext)
  |
  ↓
Target Element (WebElement)

| Object                     | Type          |
| -------------------------- | ------------- |
| Driver                     | WebDriver     |
| Shadow Host                | WebElement    |
| Shadow Root                | SearchContext |
| Element inside Shadow Root | WebElement    |

 */