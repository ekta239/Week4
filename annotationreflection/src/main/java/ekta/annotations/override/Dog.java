package ekta.annotations.override;

// Dog.java
public class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Dog barks";
    }
}
