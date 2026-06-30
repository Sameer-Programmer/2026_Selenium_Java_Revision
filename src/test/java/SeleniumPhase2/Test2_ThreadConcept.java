package SeleniumPhase2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import static java.lang.reflect.Array.set;

public class Test2_ThreadConcept {

    private static  ThreadLocal<WebDriver> tdriver = new ThreadLocal<>();
    WebDriver driver;
    public void setDriver(WebDriver driver){
        tdriver .set(driver);
    }
    public WebDriver getDriver(){
        return tdriver.get();
    }


    @Test
    public void Test1(){
        driver = new ChromeDriver();
        setDriver(driver);
        getDriver();
        getDriver().get("https://www.google.com/");
        System.out.println(getDriver().getTitle());
        getDriver().quit();
    }

    @Test
    public void Test2(){
        driver = new EdgeDriver();
        setDriver(driver);
        getDriver();
        getDriver().get("https://www.google.com/");
        System.out.println(getDriver().getTitle());
        getDriver().quit();
    }




}
