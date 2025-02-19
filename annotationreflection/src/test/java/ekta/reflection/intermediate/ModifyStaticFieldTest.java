package ekta.reflection.intermediate;

import org.junit.jupiter.api.Test;

import ekta.reflection.intermediate.Configuration;
import ekta.reflection.intermediate.ModifyStaticField;

import static org.junit.jupiter.api.Assertions.*;

public class ModifyStaticFieldTest {
    @Test
    void testModifyStaticField() throws Exception {
        ModifyStaticField.modifyApiKey("UPDATED_KEY");
        assertEquals("UPDATED_KEY", Configuration.getApiKey());
    }
}
