import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.universitycoursemgmtsystem.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    private Course<ExamCourse> examCourse;
    private Course<AssignmentCourse> assignmentCourse;
    private Course<ResearchCourse> researchCourse;

    // To capture System.out.println output
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        // Setup different courses for testing
        examCourse = new Course<>("Java Programming 101", new ExamCourse());
        assignmentCourse = new Course<>("Data Structures", new AssignmentCourse());
        researchCourse = new Course<>("Artificial Intelligence Research", new ResearchCourse());

        // Redirect System.out to capture the output
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testCourseCreation() {
        // Test the creation of courses and check their evaluation types
        assertEquals("Exam-based", examCourse.getCourseType().getEvaluationType());
        assertEquals("Assignment-based", assignmentCourse.getCourseType().getEvaluationType());
        assertEquals("Research-based", researchCourse.getCourseType().getEvaluationType());
    }

    @Test
    void testCourseDisplayDetails() {
        // Test if the course details are displayed correctly
        examCourse.displayCourseDetails();
        assertTrue(outputStreamCaptor.toString().contains("Course Name: Java Programming 101"));
        assertTrue(outputStreamCaptor.toString().contains("Course Evaluation Type: Exam-based"));
        assertTrue(outputStreamCaptor.toString().contains("Evaluation Method: Written Exam"));

        outputStreamCaptor.reset();  // Reset the output stream

        assignmentCourse.displayCourseDetails();
        assertTrue(outputStreamCaptor.toString().contains("Course Name: Data Structures"));
        assertTrue(outputStreamCaptor.toString().contains("Course Evaluation Type: Assignment-based"));
        assertTrue(outputStreamCaptor.toString().contains("Evaluation Method: Assignment Submission"));

        outputStreamCaptor.reset();  // Reset the output stream

        researchCourse.displayCourseDetails();
        assertTrue(outputStreamCaptor.toString().contains("Course Name: Artificial Intelligence Research"));
        assertTrue(outputStreamCaptor.toString().contains("Course Evaluation Type: Research-based"));
        assertTrue(outputStreamCaptor.toString().contains("Evaluation Method: Research Paper Submission"));
    }

    @Test
    void testDisplayAllCourses() {
        // Test the displayAllCourses method using a list of courses
        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(examCourse.getCourseType());
        allCourses.add(assignmentCourse.getCourseType());
        allCourses.add(researchCourse.getCourseType());

        // Display all courses using the wildcard method
        Course.displayAllCourses(allCourses);

        assertTrue(outputStreamCaptor.toString().contains("Exam-based"));
        assertTrue(outputStreamCaptor.toString().contains("Evaluation Method: Written Exam"));
        assertTrue(outputStreamCaptor.toString().contains("Assignment-based"));
        assertTrue(outputStreamCaptor.toString().contains("Evaluation Method: Assignment Submission"));
        assertTrue(outputStreamCaptor.toString().contains("Research-based"));
        assertTrue(outputStreamCaptor.toString().contains("Evaluation Method: Research Paper Submission"));
    }

    @Test
    void testDynamicCourseHandling() {
        // Test dynamic course addition and display using wildcards
        Course<ResearchCourse> newResearchCourse = new Course<>("Quantum Computing Research", new ResearchCourse());
        List<CourseType> dynamicCourses = new ArrayList<>();
        dynamicCourses.add(newResearchCourse.getCourseType());

        Course.displayAllCourses(dynamicCourses);
        
        assertTrue(outputStreamCaptor.toString().contains("Research-based"));
        assertTrue(outputStreamCaptor.toString().contains("Evaluation Method: Research Paper Submission"));
    }

    @Test
    void testEvaluationTypeDisplay() {
        // Test if the correct evaluation type is displayed for each course
        examCourse.displayCourseDetails();
        assertTrue(outputStreamCaptor.toString().contains("Written Exam"));

        outputStreamCaptor.reset();

        assignmentCourse.displayCourseDetails();
        assertTrue(outputStreamCaptor.toString().contains("Assignment Submission"));

        outputStreamCaptor.reset();

        researchCourse.displayCourseDetails();
        assertTrue(outputStreamCaptor.toString().contains("Research Paper Submission"));
    }
}
