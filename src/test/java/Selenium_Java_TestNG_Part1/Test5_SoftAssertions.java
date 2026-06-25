package Selenium_Java_TestNG_Part1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test5_SoftAssertions {
    @Test
    public void m1(){
        int a =10;
        int b =20;
        int total = a+b;
        System.out.println(total);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(40,30);
        softAssert.assertAll(); // we have t use this other wise test case will pass
    }
}
