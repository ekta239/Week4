package com.regex;

import java.util.regex.*;

public class ValidateIPAddress {
    public static boolean isValidIP(String ip) {
        return ip.matches("\\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b");
    }

    public static void main(String[] args) {
        String[] testIPs = {"192.168.1.1", "256.100.100.100", "172.16.254.1"};
        for (String ip : testIPs) {
            System.out.println(ip + " → " + (isValidIP(ip) ? "Valid" : "Invalid"));
        }
    }
}
