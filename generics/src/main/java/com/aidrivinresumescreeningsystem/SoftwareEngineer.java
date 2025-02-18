package com.aidrivinresumescreeningsystem;


// SoftwareEngineer class extends JobRole
public class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer");
    }

    @Override
    public void processResume() {
        System.out.println("Processing Software Engineer Resume...");
    }
}
