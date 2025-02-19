import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.dynamiconlinemarketplace.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarketplaceTest {

    private Product<BookCategory> book;
    private Product<ClothingCategory> shirt;
    private Product<GadgetCategory> phone;

    @BeforeEach
    void setUp() {
        // Setup products for each category
        book = new Product<>("Java Programming", 30.0, new BookCategory());
        shirt = new Product<>("T-shirt", 20.0, new ClothingCategory());
        phone = new Product<>("Smartphone", 500.0, new GadgetCategory());
    }

    @Test
    void testApplyDiscountOnBook() {
        // Apply 10% discount to the book
        DiscountUtils.applyDiscount(book, 10);
        
        // Assert that the new price is correct after applying the discount
        assertEquals(27.0, book.getPrice(), 0.01, "The price of the book should be reduced by 10%");
    }

    @Test
    void testApplyDiscountOnShirt() {
        // Apply 20% discount to the shirt
        DiscountUtils.applyDiscount(shirt, 20);
        
        // Assert that the new price is correct after applying the discount
        assertEquals(16.0, shirt.getPrice(), 0.01, "The price of the shirt should be reduced by 20%");
    }

    @Test
    void testApplyDiscountOnPhone() {
        // Apply 5% discount to the phone
        DiscountUtils.applyDiscount(phone, 5);
        
        // Assert that the new price is correct after applying the discount
        assertEquals(475.0, phone.getPrice(), 0.01, "The price of the phone should be reduced by 5%");
    }

    @Test
    void testDiscountDoesNotAlterProductName() {
        // Apply 10% discount to the book
        DiscountUtils.applyDiscount(book, 10);
        
        // Assert that the name of the book has not changed after discount
        assertEquals("Java Programming", book.getName(), "The product name should remain unchanged.");
    }

    @Test
    void testDiscountDoesNotAlterCategory() {
        // Apply 15% discount to the shirt
        DiscountUtils.applyDiscount(shirt, 15);
        
        // Assert that the category remains the same after discount
        assertTrue(shirt.getCategory() instanceof ClothingCategory, "The product category should remain Clothing.");
    }
}
