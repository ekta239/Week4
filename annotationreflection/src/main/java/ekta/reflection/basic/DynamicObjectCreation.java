package ekta.reflection.basic;

import java.lang.reflect.Constructor;

class Student {
    private String name;

    public Student() {
        this.name = "Default Student";
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class DynamicObjectCreation {
    public static Student createStudentInstance() throws Exception {
        Constructor<Student> constructor = Student.class.getDeclaredConstructor();
        return constructor.newInstance();
    }

    public static Student createStudentInstance(String name) throws Exception {
        Constructor<Student> constructor = Student.class.getDeclaredConstructor(String.class);
        return constructor.newInstance(name);
    }

    public static void main(String[] args) throws Exception {
        Student student1 = createStudentInstance();
        System.out.println("Student 1: " + student1.getName());

        Student student2 = createStudentInstance("John Doe");
        System.out.println("Student 2: " + student2.getName());
    }
}
