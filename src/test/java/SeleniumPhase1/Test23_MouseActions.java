package SeleniumPhase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

import java.time.Duration;

public class Test23_MouseActions {
    static void main(String[] args){
        String url = "https://tutorialsninja.com/demo/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);

        Actions action = new Actions(driver);
        WebElement Desktop = driver.findElement(By.linkText("Desktops"));
        WebElement PC = driver.findElement(By.xpath("//li/a[normalize-space()='PC (0)']"));
        action.moveToElement(Desktop).moveToElement(PC)
                .click()
                .build().
                perform();
        System.out.println("Done");


      //  By the Action interfcae
        /*
        Why is Action Interface Used?
Stores a built action before execution.
Created using the build() method of the Actions class.
Allows execution later using perform().
         */
//        Action ac  = action.moveToElement(Desktop).build();
//        ac.perform();


        WebElement phonesAndPDAs =
                driver.findElement(By.xpath("//li/a[normalize-space()='Phones & PDAs']"));
         action.moveToElement(phonesAndPDAs).perform();
        action.doubleClick(phonesAndPDAs).perform();


//        driver.navigate().to("https://www.softwaretestingmentor.com/automation-practice-page-right-click-demo/");
//        WebElement e1 =driver.findElement(By.xpath("//h1[text()='Automation Practice Page – Right Click Demo']"));
//        action.contextClick(e1).perform();
//        WebElement followUs = driver.findElement(By.xpath("//li/a[text()='Follow Us']"));
//        followUs.click();

        driver.navigate().to("https://testautomationpractice.blogspot.com/#");
        WebElement sourceDrag = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
        WebElement targetDrop = driver.findElement(By.xpath("//p[text()='Drop here']"));
        action.dragAndDrop(sourceDrag,targetDrop).perform();




         driver.quit();


//        action.moveToElement().perform
//        action.contextClick().perform();
//        action.dragAndDrop().perform();




    }
}


/*

 */