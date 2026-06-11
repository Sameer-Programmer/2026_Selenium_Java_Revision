package Selenium_Java_TestNG;

import org.testng.annotations.Test;

public class Test7_Groups_1 {


    @Test(priority = 1, groups = {"Sanity"})
    public void  m1(){
        System.out.println("Sanity--G1");
    }

    @Test(priority = 2, groups = {"Sanity"})
    public void  m2(){
        System.out.println("Sanity-- G1");
    }

}
