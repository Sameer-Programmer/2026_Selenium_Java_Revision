package SeleniumPhase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class Test24_SliderActions {
    static void main(String[] args) throws InterruptedException {

        String url = "https://testautomationpractice.blogspot.com/#";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);
        WebElement sliderRange  =driver.findElement(By.cssSelector("#slider-range"));
        System.out.println(sliderRange.getLocation());

        int sliderwidth = sliderRange.getSize().getWidth();
        int sliderStartIndex_Xaxis = sliderRange.getLocation().getX();
        int sliderEndIndex_Xaxis = sliderStartIndex_Xaxis+sliderwidth;

        System.out.println(sliderStartIndex_Xaxis+"     sliderStartIndex_Xaxis");
        System.out.println(sliderwidth+"         SliderWidth");
        System.out.println(sliderEndIndex_Xaxis+"    sliderEndIndex_Xaxis");

        WebElement price=driver.findElement(By.cssSelector("input[type='text'][id='amount']"));
        String priceNow = price.getText();
        System.out.println(priceNow);

        // want to Know Slider Max cordinate of  of Slider 1  to drag and Extart text


       List<WebElement> sliders = driver.findElements(By.cssSelector("[id='slider-range'] [tabindex='0']"));
       WebElement minSlider = sliders.get(0);
       System.out.println(minSlider.getLocation());
        Actions  actions = new Actions(driver);
        actions.dragAndDropBy(minSlider,-34,2028).perform();
        System.out.println(price.getText());

       // Thread.sleep(15000);
        driver.quit();




      driver.close();


    }
}

