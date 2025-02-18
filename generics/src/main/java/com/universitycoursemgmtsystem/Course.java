package com.universitycoursemgmtsystem;

import java.util.List;

public class Course<T extends CourseType> {
    private String courseName;
    private T courseType;

    public Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public String getCourseName() {
        return courseName;
    }

    public T getCourseType() {
        return courseType;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Evaluation Type: " + courseType.getEvaluationType());
        courseType.displayEvaluationMethod();
    }

    // Using wildcards to handle dynamic course types
    public static void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course.getEvaluationType());
            course.displayEvaluationMethod();
        }
    }
}
