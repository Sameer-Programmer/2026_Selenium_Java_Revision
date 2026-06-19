package SeleniumPhase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
/*
        //C:\Users\Mohamed Imran\IdeaProjects\Ymg_18_May_26\FilesToTest\Patient.txt

 */
public class Test25_FileUploads {
    static void main(String[] args){
        String url = "https://testautomationpractice.blogspot.com/#";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath + "\\FilesToTest\\Patient.txt";

        driver.findElement(By.xpath("//form[@id='singleFileForm']/input[@type='file']"))
                .sendKeys(filePath);
        WebElement submitButton = driver.findElement(By.xpath("//button[text()='Upload Single File']"));
        submitButton.click();


    }
}
