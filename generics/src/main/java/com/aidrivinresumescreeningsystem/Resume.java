package com.aidrivinresumescreeningsystem;
import java.util.List;

public class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    // Process the resume
    public void process() {
        System.out.println("Processing resume for " + jobRole.getRoleName());
        jobRole.processResume();
    }

    // Generic method to process a list of resumes of any job role
    public static <T extends JobRole> void processResumes(List<? extends JobRole> resumes) {
        if (resumes == null || resumes.isEmpty()) {
            System.out.println("No resumes to process.");
            return;
        }

        for (JobRole resume : resumes) {
            resume.processResume();
        }
    }
}
