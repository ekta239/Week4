package ekta.annotations.todoannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define the @Todo annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}
