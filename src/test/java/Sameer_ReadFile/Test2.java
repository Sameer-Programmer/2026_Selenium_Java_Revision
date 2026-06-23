package Sameer_ReadFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test2 {
    public static void main(String[] args) throws IOException {
    String projectRootPath = System.getProperty("user.dir");
        Properties properties = new Properties();
        FileInputStream fis =
                new FileInputStream(projectRootPath+"//resource//config.propertiesFile1");
        properties.load(fis);

        System.out.println(properties.getProperty("url"));

    }
}
