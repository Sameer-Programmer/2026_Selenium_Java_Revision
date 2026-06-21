package Sameer_Fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test13_SortedChecklist extends Baseclass_AutomationPractice {


    @Test
    public void m1(){

        WebElement animalTable = driver.findElement(By.cssSelector("#animals"));
        Select select = new Select(animalTable);
        select.selectByIndex(0);
        List<WebElement>animalslist=select.getOptions();

        ArrayList list1 = new ArrayList<>();
        ArrayList list2 = new ArrayList<>();


            for(WebElement animal:animalslist){
                list1.add(animal.getText());
            }
        for(WebElement animal:animalslist){
            list2.add(animal.getText());
        }

        if(list1.equals(list2) ){
            Assert.assertTrue(true);
        }




//        for(WebElement animal:animalslist ){
//          list1.add(animal.getText());
//        }
//        System.out.println(list1);
//
//        for(WebElement animal:animalslist ){
//            list2.add(animal.getText());
//        }
//        System.out.println(list2);
//
//        Collections.sort(list1);
//        boolean status = list1.equals(list2);
//        Assert.assertTrue(status);




    }
}
