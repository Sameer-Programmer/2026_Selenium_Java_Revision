# 2026 Selenium Java Revision: Comprehensive Practice Repository

## Overview

This repository, `2026 Selenium Java Revision`, serves as a comprehensive collection of Java programming exercises and Selenium WebDriver automation scripts. It is meticulously designed for individuals aiming to practice and enhance their skills in core Java concepts, data structures (specifically arrays), mathematical problem-solving, and robust web automation using Selenium with TestNG. This revision provides up-to-date practices and examples for both Java development and Selenium test automation.

## Features

-   ✨ **Core Java Concepts**: Contains examples and practice problems covering fundamental Java programming principles, including object-oriented programming, control structures, and basic data types. New additions include detailed examples for **Wrapper Classes** and advanced **OOP concepts**.
-   🔢 **Array Problems**: A dedicated section for various array manipulation and algorithm challenges, focusing on efficiency and common problem patterns.
-   ➕ **Mathematical Problems**: Solutions to common mathematical problems implemented in Java, such as prime number checks, Fibonacci series, and Armstrong numbers.
-   📚 **Collections Framework**: Demonstrations and exercises related to Java's Collections API, showcasing the usage of `ArrayList`, `HashSet`, `HashMap`, and other essential data structures.
-   🌐 **Selenium WebDriver Automation**: Practical examples of web automation using Selenium WebDriver, covering a wide range of scenarios:
    -   **Element Interaction**: Handling various types of dropdowns (Select, Bootstrap, Auto-suggestive), interacting with different types of alerts (Simple, Confirmation, Prompt), managing frames and nested frames, and interacting with **Shadow DOM** and **Nested Shadow DOM** elements.
    -   **Table Handling**: Working with static, dynamic, and paginated web tables, including data extraction and checkbox interactions within tables.
    -   **Synchronization**: Implementing different wait strategies (Implicit, Explicit, Fluent) to handle dynamic web elements and ensure test stability.
    -   **User Actions**: Performing mouse actions (hover, double-click, drag and drop) and keyboard actions.
    -   **Browser Management**: Handling multiple browser windows and tabs, utilizing various Selenium locators (ID, Name, Link Text, Class Name, Tag Name, CSS Selector, XPath), and configuring browser options like headless mode and SSL certificate handling.
    -   **Advanced Topics**: Implementing date pickers, file uploads, taking screenshots, **data-driven testing using Excel**, and **reading configurations from properties files**.
-   ✅ **TestNG Integration**: Utilizes TestNG for structuring and executing test cases in the Selenium automation suite, enabling parallel execution, data-driven testing, and detailed reporting. New examples demonstrate **TestNG execution order**, **prioritization**, and **grouping**.


## 🚀 Selenium 2026: Key Updates for Java Automation

This repository leverages **Selenium WebDriver** for robust Java-based web automation. To ensure our practices remain cutting-edge, it\'s essential to be aware of the latest advancements in the Selenium ecosystem. The year 2026 has brought significant updates with Selenium 4.40 and 4.41, and exciting prospects with the upcoming Selenium 5.0.

### Recent Advancements (Selenium 4.40 & 4.41)

Selenium has continued to evolve, with recent releases focusing on enhancing stability, performance, and integration capabilities [1]. Key updates in **Selenium 4.40** (January 2026) and **4.41** (February 2026) include:

| Feature Area | Selenium 4.40 (Jan 2026) | Selenium 4.41 (Feb 2026) |
|---|---|---|
| **Browser DevTools** | Enhanced support for Chrome DevTools v142-v144, improving debugging and interaction capabilities. | N/A |
| **BiDi Protocol** | Expanded BiDi (Bi-directional Protocol) support in Java, including methods like `setScreenOrientationOverride` and `setNetworkConditions` for advanced browser emulation. | Improved .NET BiDi support for Input, Emulation, and buffer pooling (relevant for cross-platform understanding). |
| **Grid Infrastructure** | Improvements in dynamic Grid container handling and fixes for concurrent session issues, leading to more reliable distributed testing. | Native Dynamic Grid on Kubernetes, enabling seamless integration with container orchestration. Traefik replaces Ingress NGINX as the default Helm Ingress Controller. Significant distributor reliability enhancements. |
| **Video Recording** | N/A | Event-Driven Video Recording is now the default, capturing test execution based on session events. A new `SE_UPLOAD_FAILURE_SESSION_ONLY` option allows uploading videos only for failed sessions. |
| **Session Events** | N/A | Introduction of a new Session Event API via ZeroMQ, providing real-time monitoring of session lifecycle events for external tools and dashboards. |
| **Language Bindings** | Python introduced a `LocalWebDriver` base class and improved typing (demonstrating parallel efforts across language bindings). | N/A |

### The Road Ahead: Selenium 5.0

The highly anticipated **Selenium 5.0** is expected to further stabilize the WebDriver BiDi protocol, making it a cornerstone for future interactions [2]. This major version aims to provide more robust and efficient ways to interact with browsers, particularly enhancing automation for mobile web applications and offering richer, real-time communication between test scripts and browsers. This will enable more sophisticated testing scenarios and better debugging capabilities.

### Staying Current

This repository will strive to incorporate examples and best practices that align with these latest Selenium advancements, ensuring that the provided code remains relevant and effective for modern Java-based test automation.

---

### References

[1] Selenium 4.40 Released! | Selenium. (2026, January 18). [https://www.selenium.dev/blog/2026/selenium-4-40-released/](https://www.selenium.dev/blog/2026/selenium-4-40-released/)
[2] Selenium Grid 4.41.0: What\'s New and Why It Matters | Selenium. (2026, February 22). [https://www.selenium.dev/blog/2026/selenium-grid-4-41-deep-dive/](https://www.selenium.dev/blog/2026/selenium-grid-4-41-deep-dive/)

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
│   │       ├── Execrcise_Zone/            # General Java exercises
│   │       ├── Maths2/                    # Mathematical problem solutions (e.g., Armstrong, Prime)
│   │       ├── Maths_Problems_Java/       # Additional mathematical problems
│   │       ├── Oops_PracticeZone/         # Object-Oriented Programming (OOP) concepts and practice
│   │       ├── PracticeZone/              # Mixed Java practice problems
│   │       ├── PracticeZoneInterface/     # Interface-related practice
│   │       ├── PracticeZone_Arrays/       # Array-specific practice problems
│   │       ├── PracticeZone_Collection/   # Collection-specific practice problems
│   │       ├── PracticeZone_Strings/      # String-specific practice problems
│   │       ├── ScannerExamples/           # Examples of using Java's Scanner class
│   │       ├── School_Basics/             # Basic Java control flow (break, continue)
│   │       ├── StringsConcept/            # Fundamental string concepts and manipulations
│   │       └── WrapperClass_Concept/      # Examples and concepts of Java Wrapper Classes
│   └── test/
│       └── java/
│           ├── Sameer_Fun/                # Additional Selenium WebDriver test cases and exercises
│           ├── SeleniumPhase1/            # Comprehensive Selenium WebDriver test cases with TestNG
│           ├── SeleniumPhase2/            # Further Selenium WebDriver test cases
│           ├── Selenium_Java_TestNG_1/      # TestNG specific features and examples
│           └── TestNgXMl_package/         # TestNG XML configuration files
├── FilesToTest/                     # Sample files used for testing purposes (e.g., Doctor.pdf, Patient.txt)
├── Screenshots/                     # Screenshots captured during test execution (e.g., File1.png, TablePage.png)
└── TestData/                        # Data files for data-driven testing (e.g., TestDataFile.xlsx, TestFileconfig.properties)
```

## Selenium Test Cases Overview

This section provides a detailed summary of the Selenium test cases found in the `src/test/java` directory, categorized by their respective packages.

### SeleniumPhase1

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
| **Test24_SliderActions.java** | Demonstrates handling slider elements using the `Actions` class to interact with range sliders. |
| **Test15_1_JsExecuterConcept_1.java** | Explores JavaScript Executor for performing actions like clicking elements, sending text, and various scrolling techniques (by pixels, to element, to end of page). |
| **Test15_1_JsExecuterConcept_2.java** | Provides additional examples of using JavaScript Executor for scrolling and clicking specific web elements. |
| **Test25_FileUploads.java** | Demonstrates how to handle file upload scenarios using Selenium WebDriver. |
| **Test26_MultipleFiles.java** | Provides examples for uploading multiple files simultaneously. |
| **Test27_KeyBoardActions.java** | Illustrates various keyboard actions using the `Actions` class, such as pressing keys and key combinations. |
| **Test28_TakeScreenshorts.java** | Shows how to capture screenshots during test execution for reporting and debugging purposes. |
| **Test29_browserOptions_Headless.java** | Demonstrates configuring browser options, specifically running Chrome in headless mode. |
| **Test30_HandlingSSL_browserOptions.java** | Shows how to handle SSL certificate errors by configuring browser options. |
| **Test31_incognitoMode.java** | Illustrates running the browser in incognito mode using Chrome options. |
| **Test32_ShadowDom.java** | Demonstrates how to interact with elements within a Shadow DOM. |
| **Test33_NestedShadowRoot.java** | Provides an example of interacting with elements located inside a nested Shadow DOM. |
| **Test34_Svg.java** | (Placeholder) Intended for examples of interacting with SVG elements. |
| **Test35_DataDriven_Reading.java** | Implements data-driven testing by reading test data from an external Excel file (`.xlsx`). |
| **Test36_ReadingPropertiesFile.java** | Demonstrates how to read configuration properties from a `.properties` file. |

### SeleniumPhase2

| Test File | Description |
| :--- | :--- |
| **Test1_BrokenLinks.java** | Focuses on identifying and verifying broken links on a webpage. |

### Sameer_Fun

| Test File | Description |
| :--- | :--- |
| **TakeScreenshotExercise.java** | An exercise focusing on capturing screenshots at different stages of test execution. |
| **Test1_StaticWebElemen.java** | A test case demonstrating interaction with a static web table to filter and validate data based on specific criteria (e.g., finding books by author and checking for specific authors). |

## TestNG Integration Overview

This section details the TestNG test cases and configuration files within the repository, highlighting advanced features for test management.

### Selenium_Java_TestNG_1

| Test File | Description |
| :--- | :--- |
| **Test1_AlphabeticalOrder.java** | Illustrates TestNG's default behavior of executing test methods in alphabetical order. |
| **Test2_Priority.java** | Demonstrates how to control the execution order of test methods using the `@Priority` annotation. |
| **Test3_TestNg_WorkFlow.java** | Explains the TestNG workflow, including the order of execution for annotations like `@BeforeSuite`, `@BeforeTest`, `@BeforeClass`, `@BeforeMethod`, `@Test`, `@AfterMethod`, `@AfterClass`, `@AfterTest`, and `@AfterSuite`. |
| **Test4_HardAssertions.java** | Provides examples of using TestNG's hard assertions (`Assert` class) to validate test conditions, where failure immediately stops test execution. |
| **Test5_SoftAssertions.java** | Demonstrates the use of soft assertions (`SoftAssert` class) in TestNG, allowing tests to continue execution even after an assertion failure, reporting all failures at the end. |
| **Test6_Dependency.java** | Shows how to manage test method dependencies using `dependsOnMethods` and `dependsOnGroups` attributes in TestNG. |
| **Test7_Groups_1.java** | Introduces test grouping in TestNG, allowing for selective execution of tests based on defined groups. |
| **Test8_Groups_2.java** | Further examples of TestNG groups, demonstrating how to include and exclude groups during test execution. |
| **Test9_Groups_3.java** | Advanced grouping concepts, including meta-groups and regular expression-based grouping. |

### TestNgXMl_package

| File | Description |
| :--- | :--- |
| **myFile.xml** | A sample TestNG XML configuration file demonstrating how to define test suites, tests, classes, and methods for execution. |
| **myFile2TestNG.xml** | Another example of a TestNG XML file, potentially showcasing different configurations like parallel execution or parameterization. |

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
-   **Selenium Tests**: The Selenium test cases are located under `src/test/java/SeleniumPhase1`, `src/test/java/SeleniumPhase2`, and `src/test/java/Sameer_Fun`. You can execute these tests using your IDE or via Maven from the command line:
    ```bash
    mvn test
    ```
    *Note: Ensure you have the appropriate WebDriver (e.g., ChromeDriver, GeckoDriver) configured and its path set in your system's environment variables or within the test code. Alternatively, consider using WebDriverManager for automatic driver management.* 
-   **TestNG Tests**: To run specific TestNG suites or tests defined in XML files, navigate to the project root and use the following command:
    ```bash
    mvn test -Dsurefire.suiteXmlFiles=src/test/java/TestNgXMl_package/myFile.xml
    ```
    Replace `myFile.xml` with the desired TestNG XML file.

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
