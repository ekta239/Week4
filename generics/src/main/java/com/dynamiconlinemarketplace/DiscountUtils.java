package com.dynamiconlinemarketplace;

public class DiscountUtils {

    // This method applies a discount to any product that extends Product and is bounded by Category
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discount = product.getPrice() * (percentage / 100);
        double newPrice = product.getPrice() - discount;
        product.setPrice(newPrice);
    }
}
