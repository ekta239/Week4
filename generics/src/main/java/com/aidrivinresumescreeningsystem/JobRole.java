package com.aidrivinresumescreeningsystem;

// JobRole is the base class for all job roles
public abstract class JobRole {
    private String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
    public abstract void processResume();
}