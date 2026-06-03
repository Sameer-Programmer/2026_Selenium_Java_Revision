package DaySelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test1 {
    static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://tutorialsninja.com/demo/");
        String title = driver.getTitle();
        System.out.println(title);
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        // ById
        boolean logoDisplay = driver.findElement(By.id("logo")).isDisplayed();
        System.out.println(logoDisplay);
        // By Name
        driver.findElement(By.name("search")).sendKeys("Mobiles");
        // Link text
        driver.findElement(By.linkText("Components")).click();
       List<WebElement> dropdowns = driver.findElements(By.className("dropdown-menu"));
        System.out.println(dropdowns.size());
        for(WebElement k :dropdowns){
            System.out.println(k.getText());
        }

       List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Size of Links :"+links.size());

        for(int i =0 ; i<links.size(); i++){
            System.out.println(i+":"+links.get(i).getText());
        }




        // img
        List<WebElement> totalimages=driver.findElements(By.tagName("img"));
        int allimages=totalimages.size();
        System.out.println("All Images countS"+allimages);

        for(WebElement image:totalimages){
            System.out.println(image.getText());  // this one will get the LInk text Right
        }


        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }
}

