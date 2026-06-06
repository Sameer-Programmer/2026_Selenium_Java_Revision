package DaySelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Test19_PaginationWebtable_2 {
    static void main(String[] args){

        /*
        Name : Cara Stevens;
        Age : 46;
        Same row
         */
        String url = "https://datatables.net/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);
        List<WebElement> tbodyrows = driver.findElements(By.xpath("//div[@class='dt-container']//tbody//tr"));
        System.out.println(tbodyrows.size());

        for(int r = 1; r<=tbodyrows.size(); r++){
           String age = driver.findElement(By.xpath("//div[@class='dt-container']//tr["+r+"]//td[4]")).getText();
           if(age.equals("46")){
               String name = driver.findElement(By.xpath("//div[@class='dt-container']//tr["+r+"]//td[1]")).getText();
               System.out.println(name);
               if(name.equalsIgnoreCase("Cara Stevens")){
                   System.out.println("TestcasePass");
                   break;
               }
           }
        }



    }
}
