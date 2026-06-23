package Sameer_Fun;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test17 {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.automationtesting.in/shadow-dom");
        WebElement host = driver.findElement(By.xpath("//div[@id='shadow-root']"));
        SearchContext sc = host.getShadowRoot();
       WebElement e1= sc.findElement(By.cssSelector("span"));
        System.out.println(e1.getText());

        driver.close();





    }

}
