package com.myProject.databaseManager.DataLayer.Connection;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Этот класс создан для чтения параметров коннекта из файла DatabaseConnectionProperties.properties
 */
public final class DatabasePropertiesUtil {
    private static final Properties PROPERTIES = new Properties();

    static {
        loadProperties();
    }
    // создаем метод get для чтения нужного поля из хэштейбла пропертис
    public static String get(String key){
        return PROPERTIES.getProperty(key);
    }
   // метод для чтения нужных полей из файла
    private static void loadProperties() {

    try( InputStream inputStream = DatabasePropertiesUtil.class.getClassLoader().getResourceAsStream("DatabaseConnectionProperties.properties")) {
        PROPERTIES.load(inputStream);
    } catch (IOException e) {
        throw new RuntimeException(e);
    } ;

    }
    public DatabasePropertiesUtil() {
    }
}
