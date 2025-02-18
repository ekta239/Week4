package com.smartwarehousemgmtsystem;

public class Groceries extends WarehouseItem {
    private String category;

    public Groceries(String name, int quantity, String category) {
        super(name, quantity);
        this.category = category;
    }
    public String getCategory() {
        return category;
    }

    @Override
    public void displayInfo() {
        System.out.println("Grocery Item: " + getName() + ", Quantity: " + getQuantity() + ", Category: " + category);
    }
}
