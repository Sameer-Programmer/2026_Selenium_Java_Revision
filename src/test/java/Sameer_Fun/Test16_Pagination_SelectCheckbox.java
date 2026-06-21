package Sameer_Fun;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Test16_Pagination_SelectCheckbox extends Baseclass_AutomationPractice {


    @Test
    public void selectLaptopCheckbox() throws InterruptedException {
        int count = 0;

        WebElement paginationHeader = driver.findElement(By.xpath("//h2[text()='Pagination Web Table']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()",paginationHeader);


        int totalPages = driver.findElements(By.xpath("//ul[@id='pagination']//li")).size();

        for (int i = 1; i <= totalPages; i++) {
            List<WebElement> tbodyRows = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr"));
            count = count + tbodyRows.size();
            int tbody = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();

            for (int j = 1; j <= tbody; j++) {
                String name = driver.findElement(By.xpath("//table[@id='productTable']//tr[" + j + "]//td[2]")).getText();
                if (name.equalsIgnoreCase("Laptop")) {
                  WebElement checkbox = driver.findElement(By.xpath("//table[@id='productTable']//tr[" + j + "]//td[4]/input[@type='checkbox']"));
                    js.executeScript("arguments[0].click()",checkbox);
                    Thread.sleep(3000);
                }
            }

            WebElement nextPage = driver.findElement(By.xpath("//ul[@id='pagination']//li/a[text()='" + i + "']"));
            nextPage.click();
            Thread.sleep(3000);
        }

        System.out.println(count);


    }


}
