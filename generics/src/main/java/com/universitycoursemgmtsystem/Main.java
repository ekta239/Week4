package com.universitycoursemgmtsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Create different types of courses with their respective evaluation types
        Course<ExamCourse> examCourse = new Course<>("Java Programming 101", new ExamCourse());
        Course<AssignmentCourse> assignmentCourse = new Course<>("Data Structures", new AssignmentCourse());
        Course<ResearchCourse> researchCourse = new Course<>("Artificial Intelligence Research", new ResearchCourse());

        // Display individual course details
        System.out.println("Course Details:\n");
        examCourse.displayCourseDetails();
        System.out.println();
        assignmentCourse.displayCourseDetails();
        System.out.println();
        researchCourse.displayCourseDetails();
        System.out.println();

        // Create a list of courses to demonstrate the use of wildcards
        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(examCourse.getCourseType());
        allCourses.add(assignmentCourse.getCourseType());
        allCourses.add(researchCourse.getCourseType());

        // Display all courses using wildcards
        System.out.println("All Courses (using wildcards):\n");
        Course.displayAllCourses(allCourses);

        // Additional demonstration of dynamically adding new courses and displaying them
        Course<ResearchCourse> newResearchCourse = new Course<>("Quantum Computing Research", new ResearchCourse());
        List<CourseType> dynamicCourses = new ArrayList<>();
        dynamicCourses.add(newResearchCourse.getCourseType());

        System.out.println("\nNew Dynamic Courses:\n");
        Course.displayAllCourses(dynamicCourses);
    }
}
