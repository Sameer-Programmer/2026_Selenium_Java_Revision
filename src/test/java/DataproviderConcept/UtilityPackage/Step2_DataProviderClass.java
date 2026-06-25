package DataproviderConcept.UtilityPackage;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class Step2_DataProviderClass {

    @DataProvider(name = "Dp2")
    public Object[][] m1() throws IOException {

        return  ExcelUtility_Step1.getExcelData();
    }


}
