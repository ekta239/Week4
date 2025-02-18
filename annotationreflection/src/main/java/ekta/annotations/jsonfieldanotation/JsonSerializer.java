package ekta.annotations.jsonfieldanotation;

public class JsonSerializer {
    public static void main(String[] args) throws IllegalAccessException {
        User user = new User("john_doe", "john@example.com");
        System.out.println(user.toJson());
    }
}