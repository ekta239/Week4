package ekta.reflection.advanced;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

// Define @Inject annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Inject {}

// Service class
class DatabaseService {
    public void connect() {
        System.out.println("Database connected.");
    }
}

// Client class
class Application {
    @Inject
    private DatabaseService dbService;

    public void run() {
        dbService.connect();
    }
}

// Dependency Injector
public class DependencyInjection {
    public static void injectDependencies(Object obj) throws Exception {
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                field.set(obj, field.getType().getDeclaredConstructor().newInstance());
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Application app = new Application();
        injectDependencies(app);
        app.run();
    }
}
