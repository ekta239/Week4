package ekta.annotations.repetableannotation;
import java.lang.reflect.Method;

// Apply multiple annotations
public class BugTracker {
    @BugReport(description = "Fix login issue")
    @BugReport(description = "Resolve UI bug in dashboard")
    public void fixBugs() {
        System.out.println("Fixing bugs...");
    }

    public static void main(String[] args) throws Exception {
        Method method = BugTracker.class.getMethod("fixBugs");
        BugReports reports = method.getAnnotation(BugReports.class);
        for (BugReport report : reports.value()) {
            System.out.println("Bug: " + report.description());
        }
    }
}
