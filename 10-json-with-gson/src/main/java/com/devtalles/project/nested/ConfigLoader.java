package com.devtalles.project.nested;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;

public class ConfigLoader {
    public static AppConfig loadConfig(String filePath) {
        // Esto me va a devolver un gson formateado
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileReader reader = new FileReader(filePath)) {
            return gson.fromJson(reader, AppConfig.class);
        } catch (IOException error) {
            System.out.println(error.getMessage());
        }

        return null;
    }

    static void main() {
        AppConfig config = loadConfig("config.json");

        if (config != null) {
            System.out.println("App: " + config.getAppName());
            System.out.println("Version: " + config.getVersion());
            System.out.println("Tema: " + config.getSettings().getTheme());
            System.out.println("Notificaciones: " + config.getSettings().isNotifications());
            System.out.println("Idioma: " + config.getSettings().getLanguage());
        }
    }
}
