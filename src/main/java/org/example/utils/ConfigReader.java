package org.example.utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = new Properties();

    static {
        try (InputStream inputStream = ConfigReader.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (inputStream != null) {
                properties.load(inputStream);
            } else {
                System.out.println("config.properties ფაილი ვერ მოიძებნა!");
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}