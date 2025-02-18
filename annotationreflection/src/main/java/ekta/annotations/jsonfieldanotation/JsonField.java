package ekta.annotations.jsonfieldanotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define the @JsonField annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonField {
    String name();
}