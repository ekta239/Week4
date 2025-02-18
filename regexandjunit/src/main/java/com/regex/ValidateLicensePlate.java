package com.regex;

import java.util.regex.*;

public class ValidateLicensePlate {
    public static boolean isValidLicensePlate(String plate) {
        return plate.matches("^[A-Z]{2}\\d{4}$");
    }

    public static void main(String[] args) {
        String[] testPlates = {"AB1234", "A12345", "XY6789", "ZZ0000", "C123"};
        for (String plate : testPlates) {
            System.out.println(plate + " → " + (isValidLicensePlate(plate) ? "Valid" : "Invalid"));
        }
    }
}
