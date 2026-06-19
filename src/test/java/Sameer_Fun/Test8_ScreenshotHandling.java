package Sameer_Fun;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Test8_ScreenshotHandling extends Test001Baseclass_AutomationPractice {

  @Test
    public void cpatureScreenshot() throws IOException {

        TakesScreenshot ts = (TakesScreenshot) driver;
        File src=  ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("./Screenshots//File3.png");
        FileHandler.copy(src, dest);
        System.out.println("Operation Successfull");
    }
}
