package com.regex;
import java.util.regex.*;

public class ValidateCreditCard {
    public static boolean isValidCreditCard(String cardNumber) {
        return cardNumber.matches("^4\\d{15}$") || cardNumber.matches("^5\\d{15}$");
    }

    public static void main(String[] args) {
        String[] testCards = {"4111111111111111", "5111111111111111", "6111111111111111", "4000123456789"};
        for (String card : testCards) {
            System.out.println(card + " → " + (isValidCreditCard(card) ? "Valid" : "Invalid"));
        }
    }
}
