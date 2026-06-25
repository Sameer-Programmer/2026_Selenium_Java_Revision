package Selenium_Java_TestNG_Part1;

import org.testng.Assert;
import org.testng.annotations.Test;

/*
Notes_Listner
if method 1 Failed  next line Wont execute -- nextmethod will start
 */

//HardAssertions Immediately stops the Execution if one method Assertion is Failes

public class Test4_HardAssertions {

    @Test
    public void m1(){
        int a =10;
        int b =20;
        int total = a+b;
        System.out.println(total);
        Assert.assertEquals(40,30);
    }


    @Test
    public void m2(){
        int a =10;
        int b =20;
        int total = a+b;
        System.out.println(total);
        Assert.assertEquals(40,30);
//        SoftAssert softAssert = new SoftAssert();
//        //softAssert
//        softAssert.assertTrue(total<1);
//        softAssert.assertAll(); // Mandatory
    }


}


/*

Execution Flow
m1() starts.
Assertion fails.
m1() stops immediately and is marked FAILED.
TestNG moves to m2().
m2() executes normally.
Its assertion fails and it is marked FAILED.
 */