package com.aidrivinresumescreeningsystem;

// DataScientist class extends JobRole
public class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist");
    }

    @Override
    public void processResume() {
        System.out.println("Processing Data Scientist Resume...");
    }
}
