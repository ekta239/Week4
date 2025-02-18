package com.aidrivinresumescreeningsystem;

// ProductManager class extends JobRole
public class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager");
    }

    @Override
    public void processResume() {
        System.out.println("Processing Product Manager Resume...");
    }
}
