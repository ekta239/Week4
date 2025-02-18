package com.universitycoursemgmtsystem;


// Research-based course
public class ResearchCourse extends CourseType {
    public ResearchCourse() {
        super("Research-based");
    }

    @Override
    public void displayEvaluationMethod() {
        System.out.println("Evaluation Method: Research Paper Submission");
    }
}