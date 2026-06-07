# 2026 Selenium Java Revision: Comprehensive Practice Repository

## Overview

This repository, now titled `2026 Selenium Java Revision`, serves as a comprehensive collection of Java programming exercises and Selenium WebDriver automation scripts. It is designed for individuals looking to practice and enhance their skills in core Java concepts, data structures (specifically arrays), mathematical problem-solving, and web automation using Selenium with TestNG. This revision aims to provide up-to-date practices and examples for Java and Selenium.

## Features

-   ✨ **Core Java Concepts**: Contains examples and practice problems covering fundamental Java programming principles.
-   🔢 **Array Problems**: A dedicated section for various array manipulation and algorithm challenges.
-   ➕ **Mathematical Problems**: Solutions to common mathematical problems implemented in Java.
-   📚 **Collections Framework**: Demonstrations and exercises related to Java's Collections API.
-   🌐 **Selenium WebDriver Automation**: Practical examples of web automation using Selenium WebDriver, including:
    -   Handling various types of dropdowns (Select, Bootstrap, Auto-suggestive).
    -   Interacting with different types of alerts (Simple, Confirmation, Prompt).
    -   Managing frames and nested frames.
    -   Working with static, dynamic, and paginated web tables.
    -   Implementing different wait strategies (Implicit, Explicit, Fluent).
    -   Performing mouse actions (hover, double-click, drag and drop).
    -   Handling multiple browser windows.
    -   Utilizing various Selenium locators (ID, Name, Link Text, Class Name, Tag Name, CSS Selector, XPath).
    -   Implementing date pickers.
-   ✅ **TestNG Integration**: Utilizes TestNG for structuring and executing test cases in the Selenium automation suite.

## Technologies Used

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-F26232?style=for-the-badge&logo=testng&logoColor=white)

## Project Structure

The project follows a standard Maven directory structure:

```
2026_Selenium_Java_Revision/
├── pom.xml
└── src/
    ├── main/
    │   └── java/
    │       ├── ArrayProblems/             # Various array-related programming challenges
    │       ├── Array_Examples/            # Basic array examples
    │       ├── Collections_Concept/       # Examples of Java Collections Framework
    │       ├── Concepts/                  # General Java programming concepts
    │       ├── Maths2/                    # Mathematical problem solutions (e.g., Armstrong, Prime)
    │       ├── Maths_Problems_Java/       # Additional mathematical problems
    │       ├── PracticeZone/              # Mixed Java practice problems
    │       ├── PracticeZone_Arrays/       # Array-specific practice problems
    │       ├── PracticeZone_Strings/      # String-specific practice problems
    │       └── ScannerExamples/           # Examples of using Java's Scanner class
    └── test/
        └── java/
            ├── DaySelenium1/              # Selenium WebDriver test cases with TestNG
            └── Sameer_Fun/                # Additional Selenium WebDriver test cases
```

## Selenium Test Cases Overview

Here's a summary of the Selenium test cases found in the `src/test/java` directory:

### DaySelenium1

| Test File | Description |
| :--- | :--- |
| **Test1_SeleniumLocators.java** | Demonstrates the usage of various Selenium locators (ID, Name, Link Text, Class Name, Tag Name) to identify web elements. It also covers basic driver methods like `getTitle()`, `getCurrentUrl()`, and `isDisplayed()`. |
| **Test2_driverMethods.java** | Focuses on essential WebDriver methods such as `getTitle()`, `getCurrentUrl()`, `getPageSource()`, `getWindowHandle()`, and `getWindowHandles()`. It also shows how to switch between windows. |
| **Test3_Cond__WebElement_BooleanMethods.java** | Illustrates conditional methods of WebElement like `isDisplayed()`, `isEnabled()`, and `isSelected()` to check the state of web elements. |
| **Test4_Waits.java** | Explains the implementation of Implicit and Explicit Waits in Selenium to handle synchronization issues. |
| **Test5_FluentWait.java** | Provides an example of Fluent Wait, demonstrating how to define polling intervals and ignore specific exceptions while waiting for an element. |
| **Test6_NavigateAndGetMethods.java** | Compares `driver.get()` and `driver.navigate().to()` methods, and demonstrates browser navigation commands like `back()`, `forward()`, and `refresh()`. |
| **Test7_WindowHandles.java** | Shows how to handle multiple browser windows or tabs using `getWindowHandles()` and switch control between them. |
| **Test8_ChekboxHandling.java** | Demonstrates how to interact with checkboxes, including selecting and deselecting multiple checkboxes. |
| **Test9_Alert.java** | Covers different types of alerts (Simple, Confirmation, Prompt) and how to interact with them using `alert.accept()`, `alert.dismiss()`, and `alert.sendKeys()`. |
| **Test10_AuthAlert.java** | Illustrates handling authentication pop-up alerts by embedding credentials directly in the URL. |
| **Test11_Frames.java** | Provides examples of switching between frames and nested frames using `switchTo().frame()` and returning to the main content with `defaultContent()`. |
| **Test12_Dropdowns.java** | Demonstrates handling various types of dropdowns, including `Select` class methods (`selectByIndex()`, `selectByValue()`, `selectByVisibleText()`) for static dropdowns and iterating through options. |
| **Test13_BootStrapDowns.java** | Shows how to interact with Bootstrap dropdowns, which often require clicking on elements rather than using the `Select` class. |
| **Test14_AutoSuggDropdown.java** | Explains how to handle auto-suggestive dropdowns, typically found in search bars, by typing text and selecting from the suggestions. |
| **Test15_1_StaticWebTable.java** | Demonstrates how to interact with static web tables, including counting rows and columns, and extracting specific cell data using XPath. |
| **Test15_2_WebtableAssignment.java** | An assignment example for web tables, focusing on finding book names by author and calculating the total price from a table. |
| **Test15_3_practice.java** | Further practice with web tables, specifically attempting to find the index of a column by its header text. |
| **Test16_DynamicWebTable.java** | Illustrates how to handle dynamic web tables where the content changes, specifically extracting CPU load for a process. |
| **Test17_WebTable_Checkbox.java** | Demonstrates interacting with checkboxes within a web table, including handling pagination to select checkboxes across multiple pages. |
| **Test18_PaginationWebTable_1.java** | Focuses on validating the total number of rows in a paginated web table against a dropdown selection. |
| **Test19_PaginationWebtable_2.java** | An example of extracting specific data from a paginated web table, such as finding a name based on age. |
| **Test20_PaginationWebTable_3.java** | Demonstrates iterating through all pages of a paginated web table to count the total number of entries. |
| **Test21_DatePicker_1.java** | Shows how to interact with a date picker to select a specific date by navigating through months and years. |
| **Test22_DatePicker2.java** | Another example of handling a date picker, specifically for a travel website, to select check-in dates. |
| **Test23_MouseActions.java** | Covers various mouse actions using the `Actions` class, including `moveToElement()`, `doubleClick()`, and `dragAndDrop()`. |

### Sameer_Fun

| Test File | Description |
| :--- | :--- |
| **Test1_StaticWebElemen.java** | A test case demonstrating interaction with a static web table to filter and validate data based on specific criteria (e.g., finding books by author and checking for specific authors). |

## Getting Started

To get a local copy up and running, follow these simple steps.

### Prerequisites

-   ☕ Java Development Kit (JDK) 8 or higher
-   ⚙️ Maven 3.x
-   💻 An IDE like IntelliJ IDEA or Eclipse (optional, but recommended)

### Installation

1.  **Clone the repository**:
    ```bash
    git clone https://github.com/Sameer-Programmer/2026_Selenium_Java_Revision
    cd 2026_Selenium_Java_Revision
    ```

2.  **Build the project with Maven**:
    ```bash
    mvn clean install
    ```

## Usage

-   **Java Practice**: Navigate to the `src/main/java` directory to explore various Java concept implementations and problem solutions.
-   **Selenium Tests**: The Selenium test cases are located under `src/test/java/DaySelenium1` and `src/test/java/Sameer_Fun`. You can run these tests using your IDE or Maven:
    ```bash
    mvn test
    ```
    *Note: Ensure you have the appropriate WebDriver (e.g., ChromeDriver) configured and its path set in your system or within the test code if not using WebDriverManager.* 

## Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1.  Fork the Project
2.  Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3.  Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4.  Push to the Branch (`git push origin feature/AmazingFeature`)
5.  Open a Pull Request

## License

Distributed under the MIT License. See `LICENSE` for more information. (Note: A `LICENSE` file is not currently present in the repository, but this is a common open-source license.)

## Contact

Sameer Programmer - [GitHub Profile](https://github.com/Sameer-Programmer)

Project Link: [https://github.com/Sameer-Programmer/2026_Selenium_Java_Revision](https://github.com/Sameer-Programmer/2026_Selenium_Java_Revision)
