package ekta.annotations.repetableannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define the container for repeatable annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface BugReports {
    BugReport[] value();
}