package SeleniumPhase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test22_DatePicker2 {
    static void main(String[] args){

        String url =  "https://in.trip.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);
        WebElement checkin = driver.findElement(By.xpath("//label[@for='checkInInput']"));
        checkin.click();

        String expectedyear = "2027";
        String expectedMonth = "June";
        String targetDate = "22";

        while(true){
          String CurrentMonth_year = driver.findElement(By.xpath("(//div[@class='c-calendar-month__title'])[1]")).getText();
          if(CurrentMonth_year.contains(expectedyear) && CurrentMonth_year.contains(expectedMonth)){
              break;
          }
          WebElement nextButton = driver.findElement(By.cssSelector(".c-calendar-icon-next"));
          nextButton.click();

        }

        WebElement targetCell = driver.findElement(By.xpath("//div[@class='tipWrapper']/span[text()="+targetDate+"]"));
        String targetcellText = targetCell.getText();

        if(targetcellText.contains(targetDate)){
            targetCell.click();
        }


        //driver.quit();




    }
}
