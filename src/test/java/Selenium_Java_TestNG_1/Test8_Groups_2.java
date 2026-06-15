package Selenium_Java_TestNG_1;

import org.testng.annotations.Test;

public class Test8_Groups_2 {


    @Test(priority = 1, groups = {"Regression"})
    public void  m1(){
        System.out.println("Regression--G2");
    }
    @Test(priority = 2, groups = {"Regression"})
    public void  m2(){
        System.out.println("Regression-- G2");
    }

}
