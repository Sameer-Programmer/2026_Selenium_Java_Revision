package DaySelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Test16_DynamicWebTable {
    static void main(String[] args){
      /*  For the Chrome Process get the CPU Load
      rows = indentif the chrome first
      coloumns = CPU
      Mostly Headers r coloumns  will be Constant
       */
        String url = "https://practice.expandtesting.com/dynamic-table";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);

       List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-striped']//tr"));
       List<WebElement> coloumns = driver.findElements(By.xpath("//table[@class='table table-striped']//tr/th"));
       int CPUIndex = 0;
        String expectedCPULoad = driver.findElement(By.id("chrome-cpu")).getText();

       for(int i = 0; i<coloumns.size();i++){
           if(coloumns.get(i).getText().equalsIgnoreCase("CPU")){
               CPUIndex = i+1;  // Because Xpath inex Starts from 1
               break;
           }
       }

       for(int r =2; r<=rows.size();r++){
         String chromeValue = driver.findElement(By.xpath("//table[@class='table table-striped']//tr["+r+"]//td[1]")).getText();
         if(chromeValue.equalsIgnoreCase("Chrome")){
            String  cpuValue =  driver.findElement(By.xpath("//table[@class='table table-striped']//tr["+r+"]//td["+CPUIndex+"]")).getText();
            System.out.println(cpuValue);
             if(expectedCPULoad.contains(cpuValue)){
                 System.out.println("TestCase Pass");
             }
             else{
                 System.out.println("TestCase Fail");
             }
             break;
         }
       }

        driver.close();
       driver.quit();

    }
}
