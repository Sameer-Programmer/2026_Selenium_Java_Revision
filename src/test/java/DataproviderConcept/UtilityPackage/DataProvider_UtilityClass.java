package DataproviderConcept.UtilityPackage;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataProvider_UtilityClass {


    @DataProvider(name = "LoginData1")
    public String[][] loginData(){
        String [][] data = {
                {"prapoubucowou-8216@yopmail.com", "Sameera105@"},
                {"sameeridea7@gmail.com","Sameer"}
        };
        return  data;
    }



}
