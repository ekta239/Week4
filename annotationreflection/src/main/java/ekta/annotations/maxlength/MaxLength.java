package ekta.annotations.maxlength;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define the @MaxLength annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface MaxLength {
    int value();
}