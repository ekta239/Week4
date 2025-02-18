package com.aidrivinresumescreeningsystem;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create individual resumes for different roles
        Resume<SoftwareEngineer> softwareEngineerResume = new Resume<>(new SoftwareEngineer());
        Resume<DataScientist> dataScientistResume = new Resume<>(new DataScientist());
        Resume<ProductManager> productManagerResume = new Resume<>(new ProductManager());

        // Process each resume
        softwareEngineerResume.process();
        dataScientistResume.process();
        productManagerResume.process();

        // Create a list of resumes to process dynamically using the wildcard method
        List<JobRole> jobRoles = Arrays.asList(new SoftwareEngineer(), new DataScientist(), new ProductManager());
        
        System.out.println("\nProcessing batch of resumes:");
        Resume.processResumes(jobRoles);  // Process all resumes in the list using the wildcard method
    }
}
