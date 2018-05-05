package Logic_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoneSumTest {
    @Test
    void loneSumTest() {
        System.out.print("Testing loneSum... ");

        assertEquals(6, LoneSum.loneSum(1, 2, 3));
        assertEquals(2, LoneSum.loneSum(3, 2, 3));
        assertEquals(0, LoneSum.loneSum(3, 3, 3));
        assertEquals(9, LoneSum.loneSum(9, 2, 2));
        assertEquals(9, LoneSum.loneSum(2, 2, 9));
        assertEquals(9, LoneSum.loneSum(2, 9, 2));
        assertEquals(14, LoneSum.loneSum(2, 9, 3));
        assertEquals(9, LoneSum.loneSum(4, 2, 3));
        assertEquals(3, LoneSum.loneSum(1, 3, 1));

        System.out.println("OK");
    }
}