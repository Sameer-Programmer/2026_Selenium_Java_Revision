package DaySelenium1;

/*
WebTables
1) Static WebTable
2) Dynamic WebTable
3) Table with pagination

To Print the particular data of cell
we can print by Xpath with Index

String data1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();

To Pass the  index number dynamixally in the Table

xpath = //table[@name='BookTable']//tr["+i+"]//td["+c+"]


 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Test15_1_StaticWebTable {
    static void main(String[] args) {
        String url = "https://testautomationpractice.blogspot.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);
        List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        String rows1 = rows.get(0).getText();
        System.out.println(rows1 + "           rows");
        System.out.println(rows.size());
        for (WebElement element : rows) {
            System.out.println(element.getText());
        }

        List<WebElement> coloumns = driver.findElements(By.xpath("//table[@name='BookTable']//th"));
        System.out.println(coloumns.size());
        System.out.println(coloumns.get(1).getText());

        // Extract the Data Master in Selenim with index we can send
        String data1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
        System.out.println(data1);
        for (int i = 2; i <= rows.size(); i++) {
            for (int j = 1; j <= coloumns.size(); j++) {
                String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + i + "]//td[" + j + "]"))
                        .getText();
                System.out.println(value + i);
            }
        }

        driver.quit();

    }
}
