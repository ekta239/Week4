import org.junit.jupiter.api.Test;

import com.junit.*;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;;

public class ListManagerTest {
    
    @Test
    void testAddElement() {
        ArrayList<Integer> list = new ArrayList<>();
        ListManager.addElement(list, 5);
        assertEquals(1, list.size());
    }

    @Test
    void testRemoveElement() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        ListManager.removeElement(list, 5);
        assertEquals(0, list.size());
    }

    @Test
    void testGetSize() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        assertEquals(2, ListManager.getSize(list));
    }
}
