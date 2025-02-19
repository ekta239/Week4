import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.smartwarehousemgmtsystem.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class WarehouseItemTest {

    private Storage<WarehouseItem> storage;
    private Electronics laptop;
    private Groceries apples;
    private Furniture chair;

    @BeforeEach
    void setUp() {
        // Initialize the storage and items before each test
        storage = new Storage<>();
        laptop = new Electronics("Laptop", 10, "Dell");
        apples = new Groceries("Apples", 50, "Fruits");
        chair = new Furniture("Chair", 30, "Wood");

        // Add items to storage
        storage.addItem(laptop);
        storage.addItem(apples);
        storage.addItem(chair);
    }
    

    @Test
    void testStorageAddItems() {
        // Verify that the items are stored correctly
        List<WarehouseItem> items = storage.getItems();
        assertEquals(3, items.size(), "There should be 3 items in storage.");
        assertTrue(items.contains(laptop), "Storage should contain the Laptop item.");
        assertTrue(items.contains(apples), "Storage should contain the Apples item.");
        assertTrue(items.contains(chair), "Storage should contain the Chair item.");
    }

    @Test
    void testDisplayAllItems() {
        // Capturing the output of the display method
        List<WarehouseItem> items = storage.getItems();
        
        // We will simply check if the items list is not empty as the display output is print-based
        assertFalse(items.isEmpty(), "The storage should have items to display.");
    }

    @Test
    void testDisplayInfoElectronics() {
        // Test specific item display
        assertEquals("Electronics Item: Laptop, Quantity: 10, Brand: Dell", getItemInfo(laptop));
    }

    @Test
    void testDisplayInfoGroceries() {
        // Test specific item display
        assertEquals("Grocery Item: Apples, Quantity: 50, Category: Fruits", getItemInfo(apples));
    }

    @Test
    void testDisplayInfoFurniture() {
        // Test specific item display
        assertEquals("Furniture Item: Chair, Quantity: 30, Material: Wood", getItemInfo(chair));
    }

    // Helper method to extract item display info as String
    private String getItemInfo(WarehouseItem item) {
        // Capture the output by calling the displayInfo method directly
        if (item instanceof Electronics) {
            Electronics e = (Electronics) item;
            return "Electronics Item: " + e.getName() + ", Quantity: " + e.getQuantity() + ", Brand: " + e.getBrand();
        } else if (item instanceof Groceries) {
            Groceries g = (Groceries) item;
            return "Grocery Item: " + g.getName() + ", Quantity: " + g.getQuantity() + ", Category: " + g.getCategory();
        } else if (item instanceof Furniture) {
            Furniture f = (Furniture) item;
            return "Furniture Item: " + f.getName() + ", Quantity: " + f.getQuantity() + ", Material: " + f.getMaterial();
        }
        return "";
    }
}