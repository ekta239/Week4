package ekta.annotations.todoannotation;
import java.lang.reflect.Method;


// Apply the annotation
public class TodoManager {
    @Todo(task = "Implement login validation", assignedTo = "Alice", priority = "HIGH")
    public void loginFeature() {
        System.out.println("Developing login feature...");
    }

    @Todo(task = "Optimize database queries", assignedTo = "Bob")
    public void optimizeDatabase() {
        System.out.println("Optimizing queries...");
    }

    public static void main(String[] args) throws Exception {
        for (Method method : TodoManager.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo annotation = method.getAnnotation(Todo.class);
                System.out.println("Task: " + annotation.task() + " | Assigned To: " 
                        + annotation.assignedTo() + " | Priority: " + annotation.priority());
            }
        }
    }
}
