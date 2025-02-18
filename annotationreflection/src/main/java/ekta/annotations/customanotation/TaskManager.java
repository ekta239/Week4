package ekta.annotations.customanotation;
import java.lang.reflect.Method;

// Apply the annotation
public class TaskManager {
    @TaskInfo(priority = "High", assignedTo = "John Doe")
    public void completeTask() {
        System.out.println("Task completed.");
    }

    public static void main(String[] args) throws Exception {
        Method method = TaskManager.class.getMethod("completeTask");
        TaskInfo annotation = method.getAnnotation(TaskInfo.class);
        System.out.println("Priority: " + annotation.priority());
        System.out.println("Assigned To: " + annotation.assignedTo());
    }
}
