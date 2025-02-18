package ekta.reflection.advanced;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class JsonSerializer {
    public static String toJson(Object obj) throws IllegalAccessException {
        Map<String, Object> jsonMap = new HashMap<>();
        Class<?> clazz = obj.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            jsonMap.put(field.getName(), field.get(obj));
        }
        return jsonMap.toString();
    }
}

// Sample class for testing
class Person {
    private String name = "Alice";
    private int age = 25;
}
