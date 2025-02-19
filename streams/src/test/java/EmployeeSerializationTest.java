import org.junit.jupiter.api.*;
import java.io.File;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import Ekta.serialization.*;

class EmployeeSerializationTest {
    private static final String TEST_FILE = "employees.ser";

    @BeforeEach
    void setUp() {
        new File(TEST_FILE).delete(); // Ensure clean test environment
    }

    @Test
    void testSerializationAndDeserialization() {
        List<Employee> employees = List.of(
                new Employee(1, "Alice", "HR", 50000),
                new Employee(2, "Bob", "IT", 60000),
                new Employee(3, "Charlie", "Finance", 55000)
        );

        // Serialize employees
        EmployeeSerialization.serializeEmployees(employees);

        // Deserialize employees
        List<Employee> deserializedEmployees = EmployeeSerialization.deserializeEmployees();

        // Verify that the data matches
        assertNotNull(deserializedEmployees, "Deserialized list should not be null");
        assertEquals(3, deserializedEmployees.size(), "Should contain 3 employees");
        assertEquals("Alice", deserializedEmployees.get(0).getName(), "First employee name should match");
        assertEquals("IT", deserializedEmployees.get(1).getDepartment(), "Second employee department should match");
        assertEquals(55000, deserializedEmployees.get(2).getSalary(), "Third employee salary should match");
    }

    @AfterEach
    void tearDown() {
        new File(TEST_FILE).delete(); // Cleanup test file
    }
}
