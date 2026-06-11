package Sameer_Fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.*;

public class Test1_StaticWebElemen {
    static void main(String[] args) {
        // Print the Author where Subject is Java
        String url = "https://testautomationpractice.blogspot.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);

        String expectedAutherName1 = "Mukesh";
        String expectedAutherName2 = "Amod";

        List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));

        for (int r = 2; r <= rows.size(); r++) {
            String subject = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[3]")).getText();
            if (subject.equalsIgnoreCase("Java")) {
                String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + r + "]//td[2]"))
                        .getText();
                System.out.println(author + "  " + subject);
                if (author.equals(expectedAutherName1) ||
                        author.equals(expectedAutherName2)) {

                    System.out.println("PASS");
                } else {
                    System.out.println("FAIL");
                }
            }

        }

        driver.close();
        driver.quit();

    }
}
