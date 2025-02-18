package com.universitycoursemgmtsystem;


// Exam-based course
public class ExamCourse extends CourseType {
    public ExamCourse() {
        super("Exam-based");
    }

    @Override
    public void displayEvaluationMethod() {
        System.out.println("Evaluation Method: Written Exam");
    }
}