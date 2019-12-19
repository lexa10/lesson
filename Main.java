import javafx.application.Application;

public class Main {

    public static void main(String[] args) {
        Application application = appConfig();
        Manager manager = new Manager();
        manager.setCreator(new DocumentCreatorSVG());
        manager.doWork();
    }

    private static Application appConfig() {
        return null;
    }

}
