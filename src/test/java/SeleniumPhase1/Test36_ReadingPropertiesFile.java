package SeleniumPhase1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test36_ReadingPropertiesFile {
    static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        String projectPath = System.getProperty("user.dir");
        FileInputStream fis = new FileInputStream(projectPath+"\\TestData\\TestFileconfig.properties");
        properties.load(fis);

String url = properties.getProperty("url");
        System.out.println(url);

        // want to capture onl Keys
       Set<Object> keys  = properties.keySet();
        System.out.println(keys);
    }
}
