package Warmup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test11 {

    ThreadLocal<WebDriver> tdriver =new ThreadLocal<>();
    WebDriver driver;

    public void setUp(WebDriver driver){
        tdriver.set(driver);
    }

    public WebDriver getDriver(){
        return getDriver();
    }


    @Test
    public void m1(){
        driver = new ChromeDriver();
        setUp(driver);
        getDriver();
        getDriver().get("");
    }


}
