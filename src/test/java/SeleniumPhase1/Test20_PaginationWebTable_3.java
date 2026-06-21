package SeleniumPhase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Test20_PaginationWebTable_3 {
    static void main(String[] args){

        String url = "https://datatables.net/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);
        boolean flag = true;
        int count = 0;

        while(flag){

            List<WebElement> tbodyrows = driver.findElements(By.xpath("//div[@class='dt-container']//tbody//tr"));
            System.out.println(tbodyrows.size());
            count =count+tbodyrows.size();


            WebElement nextButton =  driver.findElement(By.xpath("//button[@data-dt-idx='next']"));
            if(nextButton.getAttribute("class").contains("disabled")){
                break;
            }
            nextButton.click();

        }
        System.out.println(count);
        String result = String.valueOf(count);

       String showedValues =  driver.findElement(By.cssSelector("[id='example_info']")).getText();
       if(showedValues.contains(result)){
           System.out.println("Testcase pass");
       }else {
           System.out.println("TestFailed");
       }


    driver.quit();

    }
}
