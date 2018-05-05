package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LessBy10Test {
    @Test
    void lessBy10Test() {
        System.out.print("Testing lessBy10... ");

        assertTrue(LessBy10.lessBy10(1, 7, 11));
        assertFalse(LessBy10.lessBy10(1, 7, 10));
        assertTrue(LessBy10.lessBy10(11, 1, 7));
        assertFalse(LessBy10.lessBy10(10, 7, 1));
        assertTrue(LessBy10.lessBy10(-10, 2, 2));
        assertFalse(LessBy10.lessBy10(2, 11, 11));
        assertTrue(LessBy10.lessBy10(3, 3, 30));
        assertFalse(LessBy10.lessBy10(3, 3, 3));
        assertTrue(LessBy10.lessBy10(10, 1, 11));
        assertTrue(LessBy10.lessBy10(10, 11, 1));
        assertFalse(LessBy10.lessBy10(10, 11, 2));
        assertTrue(LessBy10.lessBy10(3, 30, 3));
        assertTrue(LessBy10.lessBy10(2, 2, -8));
        assertTrue(LessBy10.lessBy10(2, 8, 12));

        System.out.println("OK");
    }
}