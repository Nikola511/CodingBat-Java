package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TeenSumTest {
    @Test
    void teenSumTest() {
        System.out.print("Testing teenSum... ");

        assertEquals(7, TeenSum.teenSum(3, 4));
        assertEquals(19, TeenSum.teenSum(10, 13));
        assertEquals(19, TeenSum.teenSum(13, 2));
        assertEquals(19, TeenSum.teenSum(3, 19));
        assertEquals(19, TeenSum.teenSum(13, 13));
        assertEquals(20, TeenSum.teenSum(10, 10));
        assertEquals(19, TeenSum.teenSum(6, 14));
        assertEquals(19, TeenSum.teenSum(15, 2));
        assertEquals(19, TeenSum.teenSum(19, 19));
        assertEquals(19, TeenSum.teenSum(19, 20));
        assertEquals(19, TeenSum.teenSum(2, 18));
        assertEquals(16, TeenSum.teenSum(12, 4));
        assertEquals(22, TeenSum.teenSum(2, 20));
        assertEquals(19, TeenSum.teenSum(2, 17));
        assertEquals(19, TeenSum.teenSum(2, 16));
        assertEquals(13, TeenSum.teenSum(6, 7));

        System.out.println("OK");
    }
}