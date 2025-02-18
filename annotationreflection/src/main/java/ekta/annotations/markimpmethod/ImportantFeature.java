package ekta.annotations.markimpmethod;
import java.lang.reflect.Method;

// Apply the annotation
public class ImportantFeature {
    @ImportantMethod
    public void criticalTask() {
        System.out.println("Executing critical task...");
    }

    @ImportantMethod(level = "MEDIUM")
    public void moderateTask() {
        System.out.println("Executing moderate task...");
    }

    public static void main(String[] args) throws Exception {
        for (Method method : ImportantFeature.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + " | Level: " + annotation.level());
            }
        }
    }
}