package Sameer_Fun;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test14_WebTableHandling extends Baseclass_AutomationPractice{

    @Test
    public void m1(){
        //Step 1 - Find Row Size and Column Size
      int rows=  driver.findElements(By.xpath(" //table[@name='BookTable']//tr")).size();
      int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("rows   "+rows);
        System.out.println("columns  "+columns);
        WebElement table = driver.findElement(By.xpath("//table[@name='BookTable']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()",table);

      // Step 2 - Print cell
        // Blueprint of cell --> //table[@name='BookTable']//tr[2]//td[1]


        for(int i = 2; i<=rows;i++){
            for(int j =1; j<=columns;j++){
           String cellData =
                   driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]"))
                           .getText();
                System.out.print(cellData+" ");

            }
            System.out.println();
        }




    }
}
