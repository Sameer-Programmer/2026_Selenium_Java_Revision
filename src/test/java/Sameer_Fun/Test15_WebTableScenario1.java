package Sameer_Fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Test15_WebTableScenario1 extends Baseclass_AutomationPractice{

    /*
    AutherName --->Animesh
    BookName------> Learn JS --- we have  to check these two are ine same row
    Now how to deal this to remeber in  a Long term memory


    Here what we have to observe is First is
    Column of Auther  is Fix
    colum of  Book  is Fix

    so First capture the Auther then

     */

    @Test
    public void  m1(){
        int rows=  driver.findElements(By.xpath(" //table[@name='BookTable']//tr")).size();
        int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("rows   "+rows);
        System.out.println("columns  "+columns);

        for(int i = 2; i<=rows; i++){
            // //table[@name='BookTable']//tr[2]//td[1]
            String author =
                    driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]"))
                    .getText();
            if(author.equalsIgnoreCase("Animesh")){
                String bookName =
                        driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]"))
                                .getText();
                System.out.println(bookName);

                if(bookName.equalsIgnoreCase("Learn JS")){
                    Assert.assertTrue(true);
                }
            }

        }

    }


    @Test
    public void  m2(){
        int rows=  driver.findElements(By.xpath(" //table[@name='BookTable']//tr")).size();
        int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
        System.out.println("rows   "+rows);
        System.out.println("columns  "+columns);

            List<WebElement> elements =driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
                         ArrayList list1 = new ArrayList();
                    for(WebElement value :elements){
                        list1.add(value.getText());
                    }

                    int indexofAuther =list1.indexOf("Author");
                    int indexUpdatedAuthor = indexofAuther+1;
        System.out.println(indexUpdatedAuthor);


        for(int i = 2; i<=rows; i++){
            // //table[@name='BookTable']//tr[2]//td[1]
            String author =
                    driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+indexUpdatedAuthor+"]"))
                            .getText();
            if(author.equalsIgnoreCase("Animesh")){
                String bookName =
                        driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+indexUpdatedAuthor+"]"))
                                .getText();
                System.out.println(bookName);

                if(bookName.equalsIgnoreCase("Learn JS")){
                    Assert.assertTrue(true);
                }
            }

        }

    }






} //class

