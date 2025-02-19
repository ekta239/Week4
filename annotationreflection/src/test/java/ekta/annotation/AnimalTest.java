package ekta.annotation;
import org.junit.jupiter.api.Test;

import ekta.annotations.override.*;

import static org.junit.jupiter.api.Assertions.*;
public class AnimalTest {
    @Test
    void testDogMakeSound() {
        Animal dog = new Dog();
        assertEquals("Dog barks", dog.makeSound());
    }
}
