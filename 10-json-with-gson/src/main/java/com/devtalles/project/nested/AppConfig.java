package com.devtalles.project.nested;

public class AppConfig {
    private String appName;
    private String version;
    private Settings settings;

    public AppConfig(String appName, String version, Settings settings) {
        this.appName = appName;
        this.version = version;
        this.settings = settings;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    /*
                Una clase dentro de otra clase, una de las ventajas de tener una clase
                estatica dentro de otra clase es que podemos crear una instancia de
                Settings sin necesidad de tener una instancia de AppConfig.

                Si settings no fuera estatica cada vez que nosotros creamos
                AppConfig tambien se crearia un objeto de tipo Settings esto
                puede ser un desperdicio de memoria si settings no simpre se usa
                con la palabra static la clase settings no esta atada a cada
                instancia de AppConfig evitando crear objetos de manera
                innecesaria y esto claramente le da un ahorro bastante significativo
                en el consumo de la memoria, ademas, tenemos mayor flexibilidad porque
                nosotros podriamos usar esta clase settings si fuera necesario en otro
                código sin la necesidad de tener que crear una insancia de AppConfig y esto
                se consigue de la siguiente forma

                new AppConfig.Settings()
             */
    static class Settings {
        private String theme;
        private boolean notifications;
        private String language;

        public Settings(String theme, boolean notifications, String language) {
            this.theme = theme;
            this.notifications = notifications;
            this.language = language;
        }

        public String getTheme() {
            return theme;
        }

        public void setTheme(String theme) {
            this.theme = theme;
        }

        public boolean isNotifications() {
            return notifications;
        }

        public void setNotifications(boolean notifications) {
            this.notifications = notifications;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }
    }
}
