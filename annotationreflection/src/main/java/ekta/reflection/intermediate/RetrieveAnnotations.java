package ekta.reflection.intermediate;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Define the @Author annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

// Apply the annotation
@Author(name = "John Doe")
class DocumentedClass {
    public void sampleMethod() {}
}

public class RetrieveAnnotations {
    public static String getAuthor(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Author.class)) {
            Author annotation = clazz.getAnnotation(Author.class);
            return annotation.name();
        }
        return "No author annotation found";
    }

    public static void main(String[] args) {
        System.out.println("Author: " + getAuthor(DocumentedClass.class));
    }
}
