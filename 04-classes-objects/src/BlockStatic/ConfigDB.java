package BlockStatic;

public class ConfigDB {
    static final String URL;
    static final String USER;

    static {
        URL = "jdbc:mysql://localhost:3306/my_db";
        USER = "admin";

        System.out.println("Configuration loaded...");
    }

    public static void main(String[] args) {
        System.out.println(ConfigDB.URL);
        System.out.println(ConfigDB.USER);
    }
}
