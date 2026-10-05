public class AppConfig {
    private String theme;
    private String language;

    private static final AppConfig instance = new AppConfig();

    private AppConfig() {
        this.theme = "Light";
        this.language = "EN";
    }

    public static AppConfig getInstance() {
        return instance;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void printConfig() {
        System.out.println("Theme: " + theme + ", Language: " + language);
    }
}