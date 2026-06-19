package Sameer_Fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test10_MouseActions extends Baseclass_AutomationPractice {

    @Test
    public void TestMouseActions() throws InterruptedException {

        WebElement PointMe = driver.findElement(By.xpath("//button[text()= 'Point Me']"));
        WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
        WebElement laptop = driver.findElement(By.xpath("//a[text()='Laptops']"));
        WebElement checkboxSunday = driver.findElement(By.cssSelector("[id='sunday'][type='checkbox']"));
        WebElement source = driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
        WebElement drop = driver.findElement(By.xpath("//p[normalize-space()='Drop here']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(PointMe).moveToElement(mobile).moveToElement(laptop).build().perform();
        Thread.sleep(3000);
        actions.doubleClick().build().perform();
        actions.moveToElement(checkboxSunday).click().build().perform();
        actions.dragAndDrop(source,drop).build().perform();

        Thread.sleep(3000);
        actions.moveToElement(PointMe).build().perform();
        //actions.release().build().perform();







    }




}
