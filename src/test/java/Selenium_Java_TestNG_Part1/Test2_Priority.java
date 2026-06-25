package Selenium_Java_TestNG_Part1;

import org.testng.annotations.Test;

public class Test2_Priority {
    @Test(priority = 1)
    public void B(){
        System.out.println("Testcases_B_Pririty1");
    }

    @Test(priority = 2)
    public void A(){
        System.out.println("Testcases_A_Priority2");
    }
}
