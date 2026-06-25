package Selenium_Java_TestNG_1;

import org.testng.annotations.Test;

public class Test9_Groups_3 {


    @Test(priority = 1, groups = {"Regression","Sanity"})

    public void  m1(){
        System.out.println("Sanity and Regression--G3");
    }

    @Test(priority = 2, groups = {"Regression","Sanity"})
    public void  m2(){
        System.out.println("Sanity and Regression--G3");
    }
}
