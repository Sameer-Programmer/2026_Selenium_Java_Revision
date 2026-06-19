package Sameer_Fun;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Test9_Screenshots extends Baseclass_AutomationPractice {


    // FullScreeshot
    //@Test
    public void capturescreenshot() throws IOException {
        TakesScreenshot ts = (TakesScreenshot)driver;
      File source = ts.getScreenshotAs(OutputType.FILE);
      File destination = new File("./Screenshots//File3.jpeg");
        FileHandler.copy(source,destination);
    }

    @Test
    public void captureElement () throws IOException {
        WebElement e1 = driver.findElement(By.cssSelector("[name='BookTable']"));
       File source =  e1.getScreenshotAs(OutputType.FILE);
        File destination = new File("./Screenshots//File4.jpeg");
        FileHandler.copy(source,destination);

    }




}
