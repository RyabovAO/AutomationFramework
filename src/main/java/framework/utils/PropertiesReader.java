package framework.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import static framework.constants.FrameworkConstants.BROWSER_NAME;
import static framework.constants.FrameworkConstants.PROPERTIES;

public class PropertiesReader {

    public static String getPropertyValue(String key) {
        Properties prop = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream(PROPERTIES)) {
            prop.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }

    public static void setPropertyValue(String value) {
        Properties prop = new Properties();
        try (FileOutputStream fileOutputStream = new FileOutputStream(PROPERTIES)) {
            prop.setProperty(BROWSER_NAME, value);
            prop.store(fileOutputStream, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
