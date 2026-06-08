# 2026 Selenium Java Revision: Comprehensive Practice Repository

## Overview

This repository, `2026 Selenium Java Revision`, serves as a comprehensive collection of Java programming exercises and Selenium WebDriver automation scripts. It is meticulously designed for individuals aiming to practice and enhance their skills in core Java concepts, data structures (specifically arrays), mathematical problem-solving, and robust web automation using Selenium with TestNG. This revision provides up-to-date practices and examples for both Java development and Selenium test automation.

## Features

-   ✨ **Core Java Concepts**: Contains examples and practice problems covering fundamental Java programming principles, including object-oriented programming, control structures, and basic data types.
-   🔢 **Array Problems**: A dedicated section for various array manipulation and algorithm challenges, focusing on efficiency and common problem patterns.
-   ➕ **Mathematical Problems**: Solutions to common mathematical problems implemented in Java, such as prime number checks, Fibonacci series, and Armstrong numbers.
-   📚 **Collections Framework**: Demonstrations and exercises related to Java's Collections API, showcasing the usage of `ArrayList`, `HashSet`, `HashMap`, and other essential data structures.
-   🌐 **Selenium WebDriver Automation**: Practical examples of web automation using Selenium WebDriver, covering a wide range of scenarios:
    -   **Element Interaction**: Handling various types of dropdowns (Select, Bootstrap, Auto-suggestive), interacting with different types of alerts (Simple, Confirmation, Prompt), and managing frames and nested frames.
    -   **Table Handling**: Working with static, dynamic, and paginated web tables, including data extraction and checkbox interactions within tables.
    -   **Synchronization**: Implementing different wait strategies (Implicit, Explicit, Fluent) to handle dynamic web elements and ensure test stability.
    -   **User Actions**: Performing mouse actions (hover, double-click, drag and drop) and keyboard actions.
    -   **Browser Management**: Handling multiple browser windows and tabs, and utilizing various Selenium locators (ID, Name, Link Text, Class Name, Tag Name, CSS Selector, XPath).
    -   **Advanced Topics**: Implementing date pickers, file uploads, and taking screenshots.
-   ✅ **TestNG Integration**: Utilizes TestNG for structuring and executing test cases in the Selenium automation suite, enabling parallel execution, data-driven testing, and detailed reporting.

## Technologies Used

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![TestNG](https://img.shields.io/badge/TestNG-F26232?style=for-the-badge&logo=testng&logoColor=white)

## Project Structure

The project adheres to a standard Maven directory structure, facilitating easy navigation and management:

```
2026_Selenium_Java_Revision/
├── pom.xml
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── ArrayProblems/             # Various array-related programming challenges
│   │       ├── Array_Examples/            # Basic array examples
│   │       ├── ArraysConcept/             # Fundamental array concepts
│   │       ├── Collections_Concept/       # Examples of Java Collections Framework
│   │       ├── Concepts/                  # General Java programming concepts
│   │       ├── Maths2/                    # Mathematical problem solutions (e.g., Armstrong, Prime)
│   │       ├── Maths_Problems_Java/       # Additional mathematical problems
│   │       ├── PracticeZone/              # Mixed Java practice problems
│   │       ├── PracticeZoneInterface/     # Interface-related practice
│   │       ├── PracticeZone_Arrays/       # Array-specific practice problems
│   │       ├── PracticeZone_Strings/      # String-specific practice problems
│   │       ├── ScannerExamples/           # Examples of using Java's Scanner class
│   │       ├── School_Basics/             # Basic Java control flow (break, continue)
│   │       └── StringsConcept/            # Fundamental string concepts and manipulations
│   └── test/
│       └── java/
│           ├── DaySelenium1/              # Comprehensive Selenium WebDriver test cases with TestNG
│           └── Sameer_Fun/                # Additional Selenium WebDriver test cases and exercises
├── FilesToTest/                     # Sample files used for testing purposes (e.g., Doctor.pdf, Patient.txt)
└── Screenshots/                     # Screenshots captured during test execution (e.g., File1.png, TablePage.png)
```

## Selenium Test Cases Overview

This section provides a detailed summary of the Selenium test cases found in the `src/test/java` directory, categorized by their respective packages.

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
| **Test25_FileUploads.java** | Demonstrates how to handle file upload scenarios using Selenium WebDriver. |
| **Test26_MultipleFiles.java** | Provides examples for uploading multiple files simultaneously. |
| **Test27_KeyBoardActions.java** | Illustrates various keyboard actions using the `Actions` class, such as pressing keys and key combinations. |
| **Test28_TakeScreenshorts.java** | Shows how to capture screenshots during test execution for reporting and debugging purposes. |

### Sameer_Fun

| Test File | Description |
| :--- | :--- |
| **TakeScreenshotExercise.java** | An exercise focusing on capturing screenshots at different stages of test execution. |
| **Test1_StaticWebElemen.java** | A test case demonstrating interaction with a static web table to filter and validate data based on specific criteria (e.g., finding books by author and checking for specific authors). |

## Getting Started

To get a local copy of this project up and running, follow these simple steps.

### Prerequisites

Ensure you have the following software installed on your system:

-   ☕ **Java Development Kit (JDK)**: Version 8 or higher. You can download it from the [Oracle website](https://www.oracle.com/java/technologies/downloads/).
-   ⚙️ **Apache Maven**: Version 3.x. Download and install Maven from the [Apache Maven Project website](https://maven.apache.org/download.cgi).
-   💻 **Integrated Development Environment (IDE)**: While optional, an IDE like IntelliJ IDEA or Eclipse is highly recommended for better development experience and project management.

### Installation

1.  **Clone the repository**:
    ```bash
    git clone https://github.com/Sameer-Programmer/2026_Selenium_Java_Revision.git
    cd 2026_Selenium_Java_Revision
    ```

2.  **Build the project with Maven**:
    Navigate to the project's root directory (`2026_Selenium_Java_Revision`) in your terminal and execute the following command to build the project and download all necessary dependencies:
    ```bash
    mvn clean install
    ```

## Usage

-   **Java Practice**: Explore the `src/main/java` directory to delve into various Java concept implementations and problem solutions. Each sub-directory is organized by topic for easy learning.
-   **Selenium Tests**: The Selenium test cases are located under `src/test/java/DaySelenium1` and `src/test/java/Sameer_Fun`. You can execute these tests using your IDE or via Maven from the command line:
    ```bash
    mvn test
    ```
    *Note: Ensure you have the appropriate WebDriver (e.g., ChromeDriver, GeckoDriver) configured and its path set in your system's environment variables or within the test code. Alternatively, consider using WebDriverManager for automatic driver management.* 

## Contributing

Contributions are what make the open-source community an incredible place for learning, inspiration, and creation. Any contributions you make are **greatly appreciated**.

If you have suggestions for improving this project, please fork the repository and create a pull request. You can also open an issue with the tag "enhancement".

1.  Fork the Project
2.  Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3.  Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4.  Push to the Branch (`git push origin feature/AmazingFeature`)
5.  Open a Pull Request

## License

Distributed under the MIT License. See the `LICENSE` file for more information. (Note: A `LICENSE` file is not currently present in the repository, but this is a common open-source license.)

## Contact

Sameer Programmer - [GitHub Profile](https://github.com/Sameer-Programmer)

Project Link: [https://github.com/Sameer-Programmer/2026_Selenium_Java_Revision](https://github.com/Sameer-Programmer/2026_Selenium_Java_Revision)
