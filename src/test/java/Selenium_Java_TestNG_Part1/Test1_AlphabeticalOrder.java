package Selenium_Java_TestNG_1;

import org.testng.annotations.*;

/// In TestNG TestCase will Run in Alphabetical Order

public class Test1_AlphabeticalOrder {


    @BeforeTest
    public void Bfc1() {

        System.out.println("BFC1");
    }

    @AfterTest
    public void Afc1() {
        System.out.println("AFC1");
    }

    @BeforeClass
    public void c1A() {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public void c1B() {
        System.out.println("AfterClass");
    }


    @BeforeMethod
    public void m1() {
        System.out.println("BeforeMethod");
    }


    @Test
    public void B() {
        System.out.println("Testcases_B");
    }

    @Test
    public void A() {
        System.out.println("Testcases_A");
    }

    @AfterMethod
    public void m2() {
        System.out.println("AfterMethod");
    }


}
