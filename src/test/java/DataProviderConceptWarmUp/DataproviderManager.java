package DataProviderConceptWarmUp;

import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataproviderManager {


    @DataProvider(name = "Dp1")
    public Object[][] D1() throws IOException {
        return ExcelManager.m1();
    }
}
