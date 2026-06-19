package Sameer_Fun;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test11_FileUploads extends Baseclass_AutomationPractice{


@Test(enabled = false)
    public void singleFileUpload(){
    WebElement chooseFile1 = driver.findElement(By.id("singleFileInput"));
    String projectpath = System.getProperty("user.dir");
    chooseFile1.sendKeys(projectpath+"//Files//Patient.txt");
}


    @Test()
    public void MultipleFilesUplaod(){
    WebElement multipleFilesChoose = driver.findElement(By.cssSelector("#multipleFilesInput"));
        JavascriptExecutor  js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()",multipleFilesChoose);
        String projectpath = System.getProperty("user.dir");
        String file1 = projectpath+"//Files//Patient.txt";
        String file2 = projectpath+"//Files//Patient.txt";
        multipleFilesChoose.sendKeys(file1+"\n"+file2);
    }


}
