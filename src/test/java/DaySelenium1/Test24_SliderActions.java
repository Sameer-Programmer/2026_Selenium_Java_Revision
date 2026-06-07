package DaySelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class Test24_KeyBoardActions {
    static void main(String[] args) throws InterruptedException {

        String url = "https://testautomationpractice.blogspot.com/#";
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get(url);
        WebElement sliderRange  =driver.findElement(By.cssSelector("#slider-range"));
        // ── Step 1: Scroll slider into viewport ───────────────────────────────
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", sliderRange);
        Thread.sleep(500); // let scroll settle

        System.out.println(sliderRange.getLocation());
        int sliderwidth = sliderRange.getSize().getWidth();
        int sliderStartIndex = sliderRange.getLocation().getX();
        int sliderMaxCordinate = sliderStartIndex+sliderwidth;

        System.out.println(sliderStartIndex+"     sliderStartIndex");
        System.out.println(sliderwidth+"         SliderWidth");
        System.out.println(sliderMaxCordinate+"    sliderMaxCordinate");

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


/*
WARNING: Unable to find an exact match for CDP version 148, returning the closest version; found: 147; Please update to a Selenium version that supports CDP version 148
Jun 07, 2026 12:13:38 AM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
WARNING: Unable to find an exact match for CDP version 148, returning the closest version; found: 147; Please update to a Selenium version that supports CDP version 148
940     sliderStartIndex
290         SliderWidth
1230    sliderMaxCordinate

(974, 2024)
Exception in thread "main" org.openqa.selenium.interactions.MoveTargetOutOfBoundsException: move target out of bounds
  (Session info: chrome=148.0.7778.217)
Build info: version: '4.43.0', revision: 'dd0f534'
System info: os.name: 'Windows 11', os.arch: 'amd64', os.version: '10.0', java.version: '26'
Driver info: org.openqa.selenium.chrome.ChromeDriver
Command: [0707e8b981308ec4f32ca43c5f554c67, actions {actions=[org.openqa.selenium.interactions.Sequence@4310d43]}]
Capabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 148.0.7778.217, chrome: {chromedriverVersion: 148.0.7778.178 (d096af1c9e9..., userDataDir: C:\Users\MOHAME~1\AppData\L...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:63385}, goog:processID: 12692, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:63385/devtoo..., se:cdpVersion: 148.0.7778.217, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: 0707e8b981308ec4f32ca43c5f554c67
	at org.openqa.selenium.remote.ErrorCodec.decode(ErrorCodec.java:169)
	at org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:142)
	at org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)
	at org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:223)
	at org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:216)
	at org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:174)
	at org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:606)
	at org.openqa.selenium.remote.RemoteWebDriver.perform(RemoteWebDriver.java:702)
	at org.openqa.selenium.interactions.Actions$BuiltAction.perform(Actions.java:612)
	at org.openqa.selenium.interactions.Actions.perform(Actions.java:577)
	at DaySelenium1.Test24_KeyBoardActions.main(Test24_KeyBoardActions.java:40)

Process finished with exit code 1

290
290   Width
(974, 2024)
974  initialIndex
1104startPointOfSlider2
 */