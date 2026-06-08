package SeleniumPhase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test21_DatePicker_1 {
    static void main(String[] args){
        String url = "https://testautomationpractice.blogspot.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);
        String expectedyear = "2027";
        String expectedMonth = "June";
        String target = "22";
        WebElement datePicker1 = driver.findElement(By.cssSelector("input[id='datepicker'][class='hasDatepicker']"));
        datePicker1.click();

        while(true){
            String currentYear = driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();
            String currentMonth = driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();
            WebElement Nextbutton = driver.findElement(By.cssSelector(".ui-datepicker-next"));
            if(currentYear.equals(expectedyear) && currentMonth.equals(expectedMonth)){
                break;
            }
            Nextbutton.click();
        }

        driver.findElement(By.xpath(" //a[text()="+target+"]")).click();

        //driver.close();


    }
}
/*
As of now my code is Running fine I want to Pass the target data in the xpath dynamically Syntax
 */