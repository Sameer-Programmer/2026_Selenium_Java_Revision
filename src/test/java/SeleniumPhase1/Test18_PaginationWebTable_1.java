package SeleniumPhase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Test18_PaginationWebTable_1 {
    static void main(String[] args){
        /*
                Sc-1 - count Total Rows and validate the count with dropdown
         */
        String url = "https://datatables.net/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);

       List< WebElement> rows = driver.findElements(By.xpath("//div[@class='dt-container']//tbody//tr"));
        System.out.println(rows.size());
       WebElement dropdown = driver.findElement(By.cssSelector("[aria-controls = 'example'][id ='dt-length-0']"));
        Select select = new Select(dropdown); //[aria-controls = 'example'][id ='dt-length-0']
        String value1 =select.getOptions().get(0).getText();
        System.out.println(value1);
        int count = Integer.parseInt(value1);

        if(rows.size()==count){
            System.out.println("TestCase Pass");
        }
        driver.quit();

    }
}
