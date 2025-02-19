import org.junit.jupiter.api.Test;

import com.listinterface.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseListTest {

    @Test
    public void testReverseArrayList() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        ReverseList.reverseList(arrayList); // Call the method we want to test

        // Assert that the list is reversed
        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(5);
        expectedList.add(4);
        expectedList.add(3);
        expectedList.add(2);
        expectedList.add(1);

        assertEquals(expectedList, arrayList);
    }

    @Test
    public void testReverseLinkedList() {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        ReverseList.reverseList(linkedList); // Call the method we want to test

        // Assert that the list is reversed
        List<Integer> expectedList = new LinkedList<>();
        expectedList.add(5);
        expectedList.add(4);
        expectedList.add(3);
        expectedList.add(2);
        expectedList.add(1);

        assertEquals(expectedList, linkedList);
    }
}
