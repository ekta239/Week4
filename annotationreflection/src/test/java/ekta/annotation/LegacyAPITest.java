package ekta.annotation;
import org.junit.jupiter.api.Test;

import ekta.annotations.depricated.*;

import static org.junit.jupiter.api.Assertions.*;
public class LegacyAPITest {
    @Test
    void testNewFeature() {
        LegacyAPI api = new LegacyAPI();
        api.newFeature();
        assertTrue(true);
    }
}
