package com.shoppingcart;

import java.util.*;

public class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>();
    private LinkedHashMap<String, Integer> cartItems = new LinkedHashMap<>();
    private TreeMap<String, Double> sortedProducts;

    public ShoppingCart() {
        sortedProducts = new TreeMap<>(productPrices);
    }

    public void addProduct(String name, double price) {
        productPrices.put(name, price);
        sortedProducts.put(name, price);
    }

    public void addToCart(String productName, int quantity) {
        if (!productPrices.containsKey(productName)) {
            System.out.println("Product not found: " + productName);
            return;
        }
        cartItems.put(productName, cartItems.getOrDefault(productName, 0) + quantity);
    }

    public void displayCart() {
        System.out.println("\nShopping Cart:");
        for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
            String product = entry.getKey();
            int quantity = entry.getValue();
            double price = productPrices.get(product);
            System.out.println(product + " - " + quantity + " pcs - $" + (quantity * price));
        }
    }

    public void displaySortedProducts() {
        System.out.println("\nAvailable Products (Sorted by Name):");
        for (Map.Entry<String, Double> entry : sortedProducts.entrySet()) {
            System.out.println(entry.getKey() + " - $" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Apple", 1.5);
        cart.addProduct("Banana", 0.8);
        cart.addProduct("Orange", 1.2);

        cart.displaySortedProducts();

        cart.addToCart("Apple", 2);
        cart.addToCart("Banana", 3);
        cart.addToCart("Orange", 1);

        cart.displayCart();
    }
}
