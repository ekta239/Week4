import org.junit.jupiter.api.Test;

import com.listinterface.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        List<Integer> inputList = List.of(3, 1, 2, 2, 3, 4);

        // Call the method to remove duplicates
        List<Integer> result = RemoveDuplicates.removeDuplicates(inputList);

        // Define the expected result
        List<Integer> expected = List.of(3, 1, 2, 4);

        // Assert that the result matches the expected output
        assertEquals(expected, result);
    }

    @Test
    public void testEmptyList() {
        List<Integer> inputList = List.of();

        // Call the method with an empty list
        List<Integer> result = RemoveDuplicates.removeDuplicates(inputList);

        // The expected result should be an empty list
        List<Integer> expected = List.of();

        // Assert that the result matches the expected output
        assertEquals(expected, result);
    }

    @Test
    public void testSingleElement() {
        List<Integer> inputList = List.of(5);

        // Call the method with a list containing a single element
        List<Integer> result = RemoveDuplicates.removeDuplicates(inputList);

        // The expected result should be the same as the original list
        List<Integer> expected = List.of(5);

        // Assert that the result matches the expected output
        assertEquals(expected, result);
    }

    @Test
    public void testAllDuplicates() {
        List<Integer> inputList = List.of(7, 7, 7, 7, 7);

        // Call the method with a list containing all duplicates
        List<Integer> result = RemoveDuplicates.removeDuplicates(inputList);

        // The expected result should be a list with a single element
        List<Integer> expected = List.of(7);

        // Assert that the result matches the expected output
        assertEquals(expected, result);
    }

    @Test
    public void testNoDuplicates() {
        List<Integer> inputList = List.of(1, 2, 3, 4, 5);

        // Call the method with a list that has no duplicates
        List<Integer> result = RemoveDuplicates.removeDuplicates(inputList);

        // The expected result should be the same as the original list
        List<Integer> expected = List.of(1, 2, 3, 4, 5);

        // Assert that the result matches the expected output
        assertEquals(expected, result);
    }
}
