package Warmup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class Test2 {
    static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(By.id("PopUp")).click();
        Set<String> ids =  driver.getWindowHandles();
        ArrayList<String> list = new ArrayList<>(ids);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println(list.size());

        String parentID = list.get(0);
        driver.switchTo().window(parentID);
        System.out.println(driver.getTitle());

        String childId1 = list.get(1);
        driver.switchTo().window(childId1);
        System.out.println(driver.getTitle());
        driver.close();

        String childId2 = list.get(2);
        driver.switchTo().window(childId2);
        System.out.println(driver.getTitle());
        driver.close();





    }
}
