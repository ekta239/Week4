package ekta.annotation;
import org.junit.jupiter.api.Test;

import ekta.annotations.uncheckedwarning.*;

import static org.junit.jupiter.api.Assertions.*;

public class UncheckedWarningsTest {
    @Test
    void testAddElements() {
        UncheckedWarnings uw = new UncheckedWarnings();
        uw.addElements();
        assertTrue(true);
    }
}
