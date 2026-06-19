# Selenium Revision Notes

## Selenium Locators

```java
By.id()
By.name()
By.linkText()
By.className()
```

### Note:

`By.className()` accepts only a single class name.

✅ Correct

```java
By.className("header")
```

❌ Wrong

```java
By.className("header section")
```

Use CSS Selector instead:

```java
By.cssSelector(".header.section")
```

---

# WebDriver Methods

```java
driver.getWindowHandle();     // Returns String
driver.getWindowHandles();    // Returns Set<String>
driver.getTitle();
driver.getCurrentUrl();
```

---

# WebElement Boolean Methods

```java
e1.isDisplayed();  // Checks visibility (Logo, Text, Button)
e1.isEnabled();    // Checks whether element is enabled
e1.isSelected();   // Checkbox / Radio button selected
```

Examples:

```java
logo.isDisplayed();
username.isEnabled();
radioButton.isSelected();
```

---

# Waits

## Implicit Wait

```java
driver.manage().timeouts()
      .implicitlyWait(Duration.ofSeconds(10));
```

---

## Explicit Wait (WebDriverWait)

```java
WebDriverWait wait =
        new WebDriverWait(driver, Duration.ofSeconds(10));
```

Common Expected Conditions:

```java
visibilityOfElementLocated()
elementToBeClickable()
urlContains()
titleContains()
```

Example:

```java
wait.until(
    ExpectedConditions.visibilityOfElementLocated(
        By.id("username")));
```

---

## Fluent Wait

Three important things:

1. Timeout Duration
2. Polling Frequency
3. Ignoring Exceptions

```java
FluentWait<WebDriver> wait =
        new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
```

### Polling Frequency

Polling Frequency = How often Selenium checks for an element or condition before timeout is reached.

Example:

```java
.pollingEvery(Duration.ofSeconds(2))
```

Means Selenium checks every 2 seconds.

---

# Navigation Commands

```java
driver.navigate().to();
driver.navigate().forward();
driver.navigate().back();
driver.navigate().refresh();
```

---

# Passing URL Object

```java
import java.net.URL;

URL url = new URL("https://www.google.com");

driver.navigate().to(url);
```

---

# Window Handling

## Single Window ID

```java
String parentID = driver.getWindowHandle();
```

## Multiple Window IDs

```java
Set<String> windowIds =
        driver.getWindowHandles();
```

Convert Set to ArrayList

```java
ArrayList<String> list =
        new ArrayList<>(windowIds);
```

Access Window IDs

```java
String parentID = list.get(0);
String childID = list.get(1);
```

Switch Window

```java
driver.switchTo().window(childID);
```

Close Current Window

```java
driver.close();
```

Switch Back to Parent

```java
driver.switchTo().window(parentID);
```

---

# Checkboxes

Single Checkbox

```java
WebElement singleCheckbox =
        driver.findElement(By.id("check"));

singleCheckbox.click();
```

Multiple Checkboxes

```java
List<WebElement> checkboxes =
        driver.findElements(By.xpath("//input[@type='checkbox']"));

for(WebElement ch : checkboxes)
{
    ch.click();
}
```

---

# Alerts

```java
WebElement e1 =
        driver.findElement(
            By.cssSelector("button[id='alertBtn']"));

e1.click();

Alert alertRef =
        driver.switchTo().alert();
```

Accept Alert

```java
alertRef.accept();
```

Dismiss Alert

```java
alertRef.dismiss();
```

Send Text

```java
alertRef.sendKeys("Hello");
```

Get Alert Text

```java
String text = alertRef.getText();
```

---

# Authentication Alerts

Pass username and password directly in URL

```java
https://username:password@website.com
```

Example:

```java
https://admin:admin123@the-internet.herokuapp.com/basic_auth
```

---

# Frames

Switch to Frame

```java
WebElement frame1 =
        driver.findElement(By.id("frame1"));

driver.switchTo().frame(frame1);
```

Return to Main Page

```java
driver.switchTo().defaultContent();
```

---

# Select Class (Dropdown)

```java
Select select =
        new Select(driver.findElement(By.id("country")));
```

Select by Index

```java
select.selectByIndex(1);
```

Select by Value

```java
select.selectByValue("India");
```

Select by Visible Text

```java
select.selectByVisibleText("India");
```

Get All Options

```java
List<WebElement> options =
        select.getOptions();
```

Print All Options

```java
for(WebElement option : options)
{
    System.out.println(option.getText());
}
```
