import org.junit.jupiter.api.*;

import com.junit.*;
public class DatabaseConnectionTest {
    DatabaseConnection db;

    @BeforeEach
    void setup() {
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    void cleanup() {
        db.disconnect();
    }

    @Test
    void testDatabaseConnection() {
        Assertions.assertNotNull(db);
    }
}
