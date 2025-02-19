package ekta.annotation;
import org.junit.jupiter.api.Test;

import ekta.annotations.rolledalowed.*;

import static org.junit.jupiter.api.Assertions.*;

public class AccessManagerTest {
    @Test
    void testRoleBasedAccess() {
        SecureService service = new SecureService();
        Exception exception = assertThrows(SecurityException.class,
            () -> service.executeTask("USER"));
        assertEquals("Access Denied!", exception.getMessage());
    }
}
