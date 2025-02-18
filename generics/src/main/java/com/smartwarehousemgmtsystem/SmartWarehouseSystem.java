package com.smartwarehousemgmtsystem;

public class SmartWarehouseSystem {
    public static void main(String[] args) {
        // Create warehouse storage
        Storage<WarehouseItem> storage = new Storage<>();

        // Create some warehouse items
        Electronics e1 = new Electronics("Laptop", 10, "Dell");
        Groceries g1 = new Groceries("Apples", 50, "Fruits");
        Furniture f1 = new Furniture("Chair", 30, "Wood");

        // Add items to storage
        storage.addItem(e1);
        storage.addItem(g1);
        storage.addItem(f1);

        // Display all items in storage
        System.out.println("Items in warehouse storage:");
        storage.displayAllItems(storage.getItems());
    }
}
