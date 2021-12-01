package testcases.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private static final Properties prop = new Properties();

    static {
        try {
            FileInputStream configurationsFile = new FileInputStream("configurations.properties");
            prop.load(configurationsFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String get(String configName) {
        return prop.getProperty(configName);
    }

}
