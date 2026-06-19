SELENIUM FILE UPLOAD NOTES

1. FILE UPLOAD

Definition:
File Upload is the process of uploading a file from the local system to a web application using Selenium.

Key Point:
Selenium uses the sendKeys() method to upload files. The sendKeys() method works only with the <input type="file"> element.

---

2. SINGLE FILE UPLOAD

Syntax:

WebElement file = driver.findElement(By.id("singleFileInput"));
file.sendKeys("C:\Files\Patient.txt");

Steps:

1. Locate the file upload element.
2. Store the file path.
3. Pass the file path using sendKeys().
4. File gets uploaded automatically.

Advantages:

* No need to handle Windows file upload popup.
* Simple and fast.

---

3. MULTIPLE FILE UPLOAD

Syntax:

WebElement file = driver.findElement(By.id("multipleFilesInput"));

String file1 = "C:\Files\Patient.txt";
String file2 = "C:\Files\Report.txt";

file.sendKeys(file1 + "\n" + file2);

Steps:

1. Locate the multiple file upload element.
2. Store all file paths.
3. Separate file paths using "\n".
4. Pass all paths using sendKeys().

Note:
The element must contain the multiple attribute.

Example:

<input type="file" id="multipleFilesInput" multiple>

---

4. SCROLL TO ELEMENT

Sometimes the upload element is not visible on the screen.

Syntax:

JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();", element);

Purpose:
Used to bring the element into the visible area before interaction.

---

5. COMMON EXCEPTION

ElementNotInteractableException

Reason:

* Wrong locator.
* Element is hidden.
* Trying to use sendKeys() on a non-file element.

Wrong:

driver.findElement(By.id("multipleFilesForm"))
.sendKeys(file1);

Correct:

driver.findElement(By.id("multipleFilesInput"))
.sendKeys(file1);

---

6. DEBUG COMMANDS

System.out.println(element.getTagName());
System.out.println(element.getAttribute("type"));

Expected Output:

input
file

---

7. INTERVIEW QUESTIONS

Q1. How do you upload a file in Selenium?

Answer:
We use the sendKeys() method and provide the absolute file path to the <input type="file"> element.

Q2. How do you upload multiple files in Selenium?

Answer:
We pass multiple file paths separated by "\n" using the sendKeys() method.

Q3. Is Robot Class required for file upload?

Answer:
No. For standard file upload controls, sendKeys() is sufficient. Robot Class is used only when the file upload control cannot be accessed directly.

Q4. Why did you get ElementNotInteractableException?

Answer:
Because Selenium was trying to perform sendKeys() on the form element (multipleFilesForm) instead of the file input element (multipleFilesInput).

---

ONE-LINE INTERVIEW ANSWER

In Selenium, file upload is performed using the sendKeys() method by passing the file path to the <input type="file"> element. Multiple files can be uploaded by separating the file paths with "\n".
