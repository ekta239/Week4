package ekta.annotations.maxlength;


public class UserValidator {
    public static void main(String[] args) {
        try {
            User user = new User("TooLongUsername");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}