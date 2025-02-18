package com.dynamiconlinemarketplace;

public class MarketplaceTest {
    public static void main(String[] args) {
        // Create products from different categories
        Product<BookCategory> book = new Product<>("Java Programming", 30.0, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("T-shirt", 20.0, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone", 500.0, new GadgetCategory());

        // Print products before applying discounts
        System.out.println(book);
        System.out.println(shirt);
        System.out.println(phone);

        // Apply discount of 10% to each product
        DiscountUtils.applyDiscount(book, 10);
        DiscountUtils.applyDiscount(shirt, 10);
        DiscountUtils.applyDiscount(phone, 10);

        // Print products after applying discounts
        System.out.println("\nAfter applying discounts:");
        System.out.println(book);
        System.out.println(shirt);
        System.out.println(phone);
    }
}
