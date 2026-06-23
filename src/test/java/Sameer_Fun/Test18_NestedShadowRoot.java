package Sameer_Fun;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test18_NestedShadowRoot {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.automationtesting.in/shadow-dom");
        WebElement Host1 = driver.findElement(By.cssSelector("[id='shadow-root']"));
        SearchContext sr1  =Host1.getShadowRoot();

        WebElement host2 = sr1.findElement(By.cssSelector("#inner-shadow-dom"));
        SearchContext sr2 = host2.getShadowRoot();

        WebElement nestedElement = sr2.findElement(By.cssSelector("span"));
        System.out.println(nestedElement.getText());


    }
}
