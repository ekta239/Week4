import org.junit.jupiter.api.Test;

import com.listinterface.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindNthElementTest {

    // Helper method to create a sample linked list
    private ListNode createSampleList() {
        ListNode head = new ListNode('A');
        head.next = new ListNode('B');
        head.next.next = new ListNode('C');
        head.next.next.next = new ListNode('D');
        head.next.next.next.next = new ListNode('E');
        return head;
    }

    @Test
    public void testFindNthFromEnd() {
        ListNode head = createSampleList();
        int N = 2;

        // Call the method to find the Nth element from the end
        char result = FindNthElement.findNthFromEnd(head, N);

        // The expected result is 'D' (2nd from the end in the list [A, B, C, D, E])
        assertEquals('D', result);
    }

    @Test
    public void testFindNthFromEndWithLargeN() {
        ListNode head = createSampleList();
        int N = 5;

        // Call the method to find the 5th element from the end
        char result = FindNthElement.findNthFromEnd(head, N);

        // The expected result is 'A' (5th from the end in the list [A, B, C, D, E])
        assertEquals('A', result);
    }

    @Test
    public void testFindNthFromEndWithInvalidN() {
        ListNode head = createSampleList();
        int N = 6;  // N is larger than the size of the list

        // Expecting an IllegalArgumentException as N exceeds the list size
        try {
            FindNthElement.findNthFromEnd(head, N);
        } catch (IllegalArgumentException e) {
            assertEquals("N is larger than the size of the list", e.getMessage());
        }
    }

    @Test
    public void testFindNthFromEndWithSingleElement() {
        ListNode head = new ListNode('X');
        int N = 1;

        // Call the method with a single-element list
        char result = FindNthElement.findNthFromEnd(head, N);

        // The expected result is 'X' (only one element in the list)
        assertEquals('X', result);
    }
}
