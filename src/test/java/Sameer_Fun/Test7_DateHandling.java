package Sameer_Fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;




public class Test7_DateHandling {
    public static void date(String expectedyear, String expectedMonth, String expectedDate,WebDriver driver){
        WebElement datePickField =
                driver.findElement(By.xpath("(//input[@id='datepicker'])[1]"));
        datePickField.click();

//expectedyear = "2026";
//expectedMonth = "December";
//expectedDate = "26";
        while(true) {
            String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            if (currentYear.equalsIgnoreCase(expectedyear) && currentMonth.contains(expectedMonth)) {
                break;
            }
            WebElement nextButton = driver.findElement(By.xpath("//a[@title='Next']"));
            nextButton.click();
        }


        WebElement targetDate = driver.findElement(By.xpath("//a[@data-date='"+expectedDate+"']"));
        targetDate.click();
    }





    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        date("2026","December","26",driver);
    }
}
