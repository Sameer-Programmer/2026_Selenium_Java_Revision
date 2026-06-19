package Sameer_Fun;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test12_KeyBoardkeys extends Baseclass_AutomationPractice{

    @Test
    public void FillForm (){
       WebElement name =  driver.findElement(By.cssSelector("#name"));
         name.sendKeys("Sameer");
        Actions actions = new Actions(driver);

        actions.keyDown(Keys.CONTROL)
                .sendKeys("A")
                .keyUp(Keys.CONTROL)
                .perform();
        actions.keyDown(Keys.CONTROL)
                .sendKeys("C")
                .keyUp(Keys.CONTROL)
                .perform();

        actions.sendKeys(Keys.TAB).perform();
        actions.keyDown(Keys.CONTROL)
                .sendKeys("V")
                .keyUp(Keys.CONTROL)
                .perform();

    }


}
