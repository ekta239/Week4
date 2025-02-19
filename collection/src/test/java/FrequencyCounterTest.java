import org.junit.jupiter.api.Test;

import com.listinterface.*;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrequencyCounterTest {

    @Test
    public void testCountFrequency() {
        List<String> inputList = List.of("apple", "banana", "apple", "orange");

        // Call the method to count frequency
        Map<String, Integer> result = FrequencyCounter.countFrequency(inputList);

        // Define the expected output
        Map<String, Integer> expected = Map.of(
                "apple", 2,
                "banana", 1,
                "orange", 1
        );

        // Assert that the result matches the expected output
        assertEquals(expected, result);
    }

    @Test
    public void testEmptyList() {
        List<String> inputList = List.of();

        // Call the method with an empty list
        Map<String, Integer> result = FrequencyCounter.countFrequency(inputList);

        // The expected result should be an empty map
        Map<String, Integer> expected = Map.of();

        // Assert that the result matches the expected output
        assertEquals(expected, result);
    }

    @Test
    public void testSingleElement() {
        List<String> inputList = List.of("apple", "apple");

        // Call the method with a list containing a single element repeated
        Map<String, Integer> result = FrequencyCounter.countFrequency(inputList);

        // The expected result should show the count of "apple" as 2
        Map<String, Integer> expected = Map.of("apple", 2);

        // Assert that the result matches the expected output
        assertEquals(expected, result);
    }
}
