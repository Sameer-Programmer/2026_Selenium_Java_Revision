package SeleniumPhase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Test15_3_Practice_Columns {
    static void main(String[] args){

        String url = "https://testautomationpractice.blogspot.com/";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);
        List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        List<WebElement> coloumns = driver.findElements(By.xpath("//table[@name='BookTable']//th"));
        System.out.println(coloumns.size());

      int indexOfPrice = coloumns.indexOf("Price");
      System.out.println(indexOfPrice+"   index of Price");

        for(int i = 0; i<coloumns.size();i++){
            String headerText = coloumns.get(i).getText();
            System.out.println(headerText);
        }

    }
}
/*
4
-1   index of Price
BookName
Author
Subject
Price
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 4 out of bounds for length 4
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)

 */