package Selenium_Java_TestNG_Part2;

import org.testng.annotations.Test;

public class Test1 {

    @Test (groups = {"Sanity"})
    public void m1(){
        System.out.println("Sanity");
    }
    @Test (groups = {"Sanity"})
    public void m2(){
        System.out.println("Sanity");
    }

    @Test(groups = {"Regression"})
    public void m3(){
        System.out.println("Regression");
    }
    @Test(groups = {"Regression"})
    public void m4(){
        System.out.println("Regression");
    }

    @Test(groups = {"Regression","Sanity"})
    public void m5(){
        System.out.println("Regression_And_Sanity");
    }
    @Test(groups = {"Regression","Sanity"})
    public void m6(){
        System.out.println("Regression_And_Sanity");
    }






}
