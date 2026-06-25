package Warmup;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4_ShadoDomeHandling {

    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.automationtesting.in/shadow-dom");

        SearchContext root1 = driver.findElement(By.xpath("//div[@id='shadow-root']")).getShadowRoot();
        SearchContext root2 = root1.findElement(By.cssSelector("[id='inner-shadow-dom']")).getShadowRoot();
        WebElement e1 =root2.findElement(By.cssSelector("#nested-shadow-element"));
        System.out.println(e1.getText());
        driver.close();
    }




}
