package ekta.reflection.intermediate;

import java.lang.reflect.Field;

class Configuration {
    private static String API_KEY = "OLD_KEY";

    public static String getApiKey() {
        return API_KEY;
    }
}

public class ModifyStaticField {
    public static void modifyApiKey(String newKey) throws Exception {
        Field field = Configuration.class.getDeclaredField("API_KEY");
        field.setAccessible(true);
        field.set(null, newKey);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Before Modification: " + Configuration.getApiKey());
        modifyApiKey("NEW_KEY");
        System.out.println("After Modification: " + Configuration.getApiKey());
    }
}
