
package ekta.reflection.basic;

import java.lang.reflect.Field;

class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }
}

public class AccessPrivateField {
    public static int getPrivateAge(Person person) throws Exception {
        Field ageField = Person.class.getDeclaredField("age");
        ageField.setAccessible(true);
        return ageField.getInt(person);
    }

    public static void setPrivateAge(Person person, int newAge) throws Exception {
        Field ageField = Person.class.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.setInt(person, newAge);
    }

    public static void main(String[] args) throws Exception {
        Person person = new Person(25);
        System.out.println("Old Age: " + getPrivateAge(person));
        setPrivateAge(person, 30);
        System.out.println("New Age: " + getPrivateAge(person));
    }
}
