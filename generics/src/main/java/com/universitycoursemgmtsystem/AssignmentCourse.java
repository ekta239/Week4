package com.universitycoursemgmtsystem;


// Assignment-based course
public class AssignmentCourse extends CourseType {
    public AssignmentCourse() {
        super("Assignment-based");
    }

    @Override
    public void displayEvaluationMethod() {
        System.out.println("Evaluation Method: Assignment Submission");
    }
}