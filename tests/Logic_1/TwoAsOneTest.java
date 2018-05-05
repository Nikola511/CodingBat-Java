package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoAsOneTest {
    @Test
    void twoAsOneTest() {
        System.out.print("Testing twoAsOne... ");

        assertTrue(TwoAsOne.twoAsOne(1, 2, 3));
        assertTrue(TwoAsOne.twoAsOne(3, 1, 2));
        assertFalse(TwoAsOne.twoAsOne(3, 2, 2));
        assertTrue(TwoAsOne.twoAsOne(2, 3, 1));
        assertTrue(TwoAsOne.twoAsOne(5, 3, -2));
        assertFalse(TwoAsOne.twoAsOne(5, 3, -3));
        assertTrue(TwoAsOne.twoAsOne(2, 5, 3));
        assertFalse(TwoAsOne.twoAsOne(9, 5, 5));
        assertTrue(TwoAsOne.twoAsOne(9, 4, 5));
        assertTrue(TwoAsOne.twoAsOne(5, 4, 9));
        assertTrue(TwoAsOne.twoAsOne(3, 3, 0));
        assertFalse(TwoAsOne.twoAsOne(3, 3, 2));

        System.out.println("OK");
    }
}