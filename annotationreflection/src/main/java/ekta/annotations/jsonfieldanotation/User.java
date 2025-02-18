package ekta.annotations.jsonfieldanotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

// User class with annotated fields
public class User {
    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_email")
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String toJson() throws IllegalAccessException {
        Map<String, String> jsonMap = new HashMap<>();
        for (Field field : this.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                jsonMap.put(field.getAnnotation(JsonField.class).name(), (String) field.get(this));
            }
        }
        return jsonMap.toString();
    }
}
