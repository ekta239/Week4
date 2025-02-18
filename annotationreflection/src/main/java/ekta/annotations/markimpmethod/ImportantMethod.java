package ekta.annotations.markimpmethod;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


// Define the annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface ImportantMethod {
    String level() default "HIGH";
}