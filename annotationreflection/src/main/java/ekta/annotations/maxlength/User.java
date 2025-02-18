package ekta.annotations.maxlength;
import java.lang.reflect.Field;


// Apply the annotation
public class User {
    @MaxLength(10)
    private String username;

    public User(String username) throws Exception {
        if (username.length() > User.class.getDeclaredField("username")
                .getAnnotation(MaxLength.class).value()) {
            throw new IllegalArgumentException("Username exceeds max length!");
        }
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
