package com.smartwarehousemgmtsystem;

public class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String name, int quantity, String material) {
        super(name, quantity);
        this.material = material;
    }
    public String getMaterial() {
        return material;
    }
    @Override
    public void displayInfo() {
        System.out.println("Furniture Item: " + getName() + ", Quantity: " + getQuantity() + ", Material: " + material);
    }
}
