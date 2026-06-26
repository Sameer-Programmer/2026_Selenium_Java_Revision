package CookiesConcept;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class HandlingCookies {


    @Test
    public void m1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");

        //How to Capture Cookies
        Set<Cookie> cookies = driver.manage().getCookies();
        int sizeOfCookies = cookies.size();
        System.out.println(sizeOfCookies);

        for (Cookie c : cookies) {
            System.out.println(c.getName() + ":      " + c.getValue());
        }

        Cookie ck = new Cookie("SameerCookie", "Value1");
        driver.manage().addCookie(ck);

        Set<Cookie> cookies1 = driver.manage().getCookies();
        int sizeOfCookies1 = cookies1.size();
        System.out.println(sizeOfCookies1);

        //Delete the cookie by refofObj
//        driver.manage().deleteCookie(ck);
//        cookies =   driver.manage().getCookies();
//        System.out.println(cookies.size());


        driver.manage().deleteCookieNamed("SameerCookie");
        cookies = driver.manage().getCookies();
        System.out.println(cookies.size());


        // delete all cookies

        driver.manage().deleteAllCookies();
        cookies = driver.manage().getCookies();
        System.out.println(cookies.size());


        driver.quit();


    }

}
