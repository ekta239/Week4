import org.junit.jupiter.api.Test;

import com.listinterface.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListRotatorTest {

    @Test
    public void testRotateList() {
        List<Integer> inputList = List.of(10, 20, 30, 40, 50);
        int positions = 2;

        // Call the method to rotate the list
        List<Integer> result = ListRotator.rotateList(inputList, positions);

        // Define the expected rotated list
        List<Integer> expected = List.of(30, 40, 50, 10, 20);

        // Assert that the result matches the expected output
        assertEquals(expected, result);
    }

    @Test
    public void testRotateListWithLargerPositions() {
        List<Integer> inputList = List.of(10, 20, 30, 40, 50);
        int positions = 7; // 7 is larger than the size of the list

        // Call the method to rotate the list
        List<Integer> result = ListRotator.rotateList(inputList, positions);

        // Expected result after rotating by 7 positions (7 % 5 = 2)
        List<Integer> expected = List.of(30, 40, 50, 10, 20);

        // Assert that the result matches the expected output
        assertEquals(expected, result);
    }

    @Test
    public void testRotateEmptyList() {
        List<Integer> inputList = List.of();
        int positions = 3;

        // Call the method to rotate the empty list
        List<Integer> result = ListRotator.rotateList(inputList, positions);

        // The expected result for an empty list should be an empty list
        List<Integer> expected = List.of();

        // Assert that the result matches the expected output
        assertEquals(expected, result);
    }

    @Test
    public void testRotateListByZero() {
        List<Integer> inputList = List.of(10, 20, 30, 40, 50);
        int positions = 0;

        // Call the method with 0 rotations
        List<Integer> result = ListRotator.rotateList(inputList, positions);

        // The expected result should be the same as the original list
        List<Integer> expected = List.of(10, 20, 30, 40, 50);

        // Assert that the result matches the expected output
        assertEquals(expected, result);
    }
}
