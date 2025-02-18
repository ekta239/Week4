package com.smartwarehousemgmtsystem;

public class Electronics extends WarehouseItem {
    private String brand;

    public Electronics(String name, int quantity, String brand) {
        super(name, quantity);
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    @Override
    public void displayInfo() {
        System.out.println("Electronics Item: " + getName() + ", Quantity: " + getQuantity() + ", Brand: " + brand);
    }
}
