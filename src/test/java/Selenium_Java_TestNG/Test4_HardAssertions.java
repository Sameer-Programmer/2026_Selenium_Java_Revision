package Selenium_Java_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test4 {

    @Test
    public void m1(){
        int a =10;
        int b =20;
        int total = a+b;
        System.out.println(total);
        SoftAssert softAssert = new SoftAssert();
        //softAssert
        Assert.assertTrue(total==30);
      //  Assert.assertTrue(total<1);
    }


    @Test
    public void m2(){
        int a =10;
        int b =20;
        int total = a+b;
        System.out.println(total);
        SoftAssert softAssert = new SoftAssert();
        //softAssert
        softAssert.assertTrue(total<1);
        softAssert.assertAll(); // Mandatory
    }


}
