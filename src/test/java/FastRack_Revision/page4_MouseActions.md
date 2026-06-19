# Selenium Actions Class - Interview Revision Notes

## What is Actions Class?

Actions class is used to perform advanced mouse and keyboard operations in Selenium.

### Import Statement

```java
import org.openqa.selenium.interactions.Actions;
```

### Object Creation

```java
Actions actions = new Actions(driver);
```

---

# 1. Mouse Hover

Used to move the mouse pointer over an element.

```java
Actions actions = new Actions(driver);
actions.moveToElement(element).perform();
```

---

# 2. Right Click (Context Click)

Used to perform a right-click operation.

```java
Actions actions = new Actions(driver);
actions.contextClick(element).perform();
```

---

# 3. Double Click

Used to double-click on an element.

```java
Actions actions = new Actions(driver);
actions.doubleClick(element).perform();
```

---

# 4. Click

Used when normal WebElement click() is not working.

```java
Actions actions = new Actions(driver);
actions.click(element).perform();
```

---

# 5. Click and Hold

Used to click and hold the mouse button on an element.

```java
Actions actions = new Actions(driver);
actions.clickAndHold(element).perform();
```

---

# 6. Release

Used to release the mouse button after clickAndHold().

```java
Actions actions = new Actions(driver);
actions.release().perform();
```

---

# 7. Drag and Drop

Used to drag an element and drop it onto another element.

```java
Actions actions = new Actions(driver);
actions.dragAndDrop(source, target).perform();
```

---

# 8. Drag and Drop by Offset

Used to drag an element by specified x and y coordinates.

```java
Actions actions = new Actions(driver);
actions.dragAndDropBy(element, 100, 50).perform();
```

---

# Click and Hold + Move + Release

```java
Actions actions = new Actions(driver);

actions.clickAndHold(source)
       .moveToElement(target)
       .release()
       .perform();
```

---

# Build and Perform

```java
Actions actions = new Actions(driver);

actions.moveToElement(element)
       .build()
       .perform();
```

Note:

* perform() executes the action.
* build() creates a composite action before execution.
* In Selenium 4, build() is usually optional.

---

# Frequently Asked Interview Methods

1. moveToElement()  -> Mouse Hover
2. contextClick()  -> Right Click
3. doubleClick()   -> Double Click
4. click()         -> Click
5. clickAndHold()  -> Hold Mouse Button
6. release()       -> Release Mouse Button
7. dragAndDrop()   -> Drag and Drop
8. dragAndDropBy() -> Drag by Coordinates

---

# Interview Answer

Actions class is used to perform advanced user interactions such as mouse hover, right-click, double-click, drag-and-drop, click-and-hold, and keyboard actions. It is part of Selenium WebDriver and helps automate complex user gestures.
