package DaySelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test26_MultipleFiles {
    static void main(String[] args){
        String url = "https://testautomationpractice.blogspot.com/#";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);

        WebElement multipleChooseFile = driver.findElement(By.cssSelector("#multipleFilesInput"));
        WebElement buttonMultipleFiles = driver.findElement(By.xpath("//button[text()='Upload Multiple Files']"));


        String projectPath = System.getProperty("user.dir");
        // Inside our Project Root Created a Directory or Folder Inside Folder add tw Files
        // Because for the CICD This wil Helpfull _Local Machine path Works Only if we run the script in this Same Machine
        String file1 = projectPath+"\\FilesToTest\\Patient.txt";
        String file2 = projectPath+"\\FilesToTest\\Doctor.pdf";

        multipleChooseFile.sendKeys(file1+"\n"+file2);
        buttonMultipleFiles.click();
        driver.quit();
    }
}
