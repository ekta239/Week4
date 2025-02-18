package ekta.annotations.rolledalowed;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define the @RoleAllowed annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface RoleAllowed {
    String value();
}