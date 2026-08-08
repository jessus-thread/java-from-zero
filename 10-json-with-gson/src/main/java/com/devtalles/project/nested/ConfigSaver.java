package com.devtalles.project.nested;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConfigSaver {
    public static void saveConfig(AppConfig config, String filePath) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(config, writer);

            System.out.println("Configuración guardada correctamente.");
        } catch (IOException error) {
            System.out.println(error.getMessage());
        }
    }

    static void main() {
        AppConfig config = ConfigLoader.loadConfig("config.json");

        if (config != null) {
            config.getSettings().setTheme("Light");

            saveConfig(config, "config.json");
        }
    }
}
