package com.smartwarehousemgmtsystem;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {
    private List<T> items;

    public Storage() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    // Method using wildcard to display items
    public void displayAllItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            item.displayInfo();
        }
    }
}
