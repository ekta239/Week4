import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.aidrivinresumescreeningsystem.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class ResumeScreeningTest {

    private Resume<SoftwareEngineer> softwareEngineerResume;
    private Resume<DataScientist> dataScientistResume;
    private Resume<ProductManager> productManagerResume;

    @BeforeEach
    void setUp() {
        // Initialize resume objects for testing
        softwareEngineerResume = new Resume<>(new SoftwareEngineer());
        dataScientistResume = new Resume<>(new DataScientist());
        productManagerResume = new Resume<>(new ProductManager());
    }

    @Test
    void testProcessSoftwareEngineerResume() {
        softwareEngineerResume.process();
    }

    @Test
    void testProcessDataScientistResume() {
        dataScientistResume.process();
    }

    @Test
    void testProcessProductManagerResume() {
        productManagerResume.process();
    }

    @Test
    void testProcessResumesBatch() {
        List<JobRole> jobRoles = Arrays.asList(new SoftwareEngineer(), new DataScientist(), new ProductManager());
        Resume.processResumes(jobRoles);
    }

    @Test
    void testNullInputForResumeProcessing() {
        List<JobRole> jobRoles = null;
        Resume.processResumes(jobRoles);  // Should handle null gracefully (for example, by checking null inside method)
    }
}
