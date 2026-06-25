package Warmup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test10 {
    WebDriver driver;
    @Parameters("browser")
    @BeforeClass(groups = {"Master"})
    public void m1(String browser) {

        switch (browser.toLowerCase()){
            case "chrome" : driver = new ChromeDriver();break;
            case "edge" : driver = new EdgeDriver();break;
            default:
                System.out.println("Select chrome or edge");
                return;
        }

        driver.get("https://tutorialsninja.com/demo/");

    }

    @Test(groups = {"Master"})
    public void m1(){
        WebElement element = driver.findElement(By.xpath("//a[text()='Qafox.com']"));
        Assert.assertTrue(element.isDisplayed());
        driver.close();
    }
}
