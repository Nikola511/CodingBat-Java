package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InOrderTest {
    @Test
    void inOrderTest() {
        System.out.print("Testing inOrder... ");

        assertTrue(InOrder.inOrder(1, 2, 4, false));
        assertFalse(InOrder.inOrder(1, 2, 1, false));
        assertTrue(InOrder.inOrder(1, 1, 2, true));
        assertFalse(InOrder.inOrder(3, 2, 4, false));
        assertTrue(InOrder.inOrder(2, 3, 4, false));
        assertTrue(InOrder.inOrder(3, 2, 4, true));
        assertFalse(InOrder.inOrder(4, 2, 2, true));
        assertFalse(InOrder.inOrder(4, 5, 2, true));
        assertTrue(InOrder.inOrder(2, 4, 6, true));
        assertTrue(InOrder.inOrder(7, 9, 10, false));
        assertTrue(InOrder.inOrder(7, 5, 6, true));
        assertFalse(InOrder.inOrder(7, 5, 4, true));

        System.out.println("OK");
    }
}