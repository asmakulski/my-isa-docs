package com.aem;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppProperties {

    private  Properties properties;

    public void loadProperties() {
        try (InputStream resourceAsStream = AppProperties.class.getResourceAsStream("app.properties")) {
            Properties properties = new Properties();
            properties.load(resourceAsStream);
            this.properties = properties;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getSourceFilePath (){
        loadProperties();
        return properties.getProperty("sourceFilePath");
    }
}