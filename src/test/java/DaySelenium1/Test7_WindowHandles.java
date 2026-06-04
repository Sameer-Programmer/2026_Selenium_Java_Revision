package DaySelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class Test7_WindowHandles {
    static void main(String[] args) {
        String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.get(url);
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        Set<String> windowIds=  driver.getWindowHandles();
        ArrayList<String> arrayList = new ArrayList<>(windowIds);
        System.out.println(arrayList.size());

        String parentID = arrayList.get(0);
        String childId = arrayList.get(1);

        System.out.println(parentID);
        System.out.println(childId);

        Object parentwindowTitle = driver.switchTo().window(parentID).getTitle();
        String childwindowTitle = driver.switchTo().window(childId).getTitle();

        System.out.println(parentwindowTitle);
        System.out.println(childwindowTitle);

       String parentwindowURl =  driver.switchTo().window(parentID).getCurrentUrl();
        System.out.println(parentwindowURl);


        driver.close();
        driver.quit();




    }
}
