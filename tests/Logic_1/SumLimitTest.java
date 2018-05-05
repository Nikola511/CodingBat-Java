package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumLimitTest {
    @Test
    void sumLimitTest() {
        System.out.print("Testing sumLimit... ");

        assertEquals(5, SumLimit.sumLimit(2, 3));
        assertEquals(8, SumLimit.sumLimit(8, 3));
        assertEquals(9, SumLimit.sumLimit(8, 1));
        assertEquals(50, SumLimit.sumLimit(11, 39));
        assertEquals(11, SumLimit.sumLimit(11, 99));
        assertEquals(0, SumLimit.sumLimit(0, 0));
        assertEquals(99, SumLimit.sumLimit(99, 0));
        assertEquals(99, SumLimit.sumLimit(99, 1));
        assertEquals(124, SumLimit.sumLimit(123, 1));
        assertEquals(1, SumLimit.sumLimit(1, 123));
        assertEquals(83, SumLimit.sumLimit(23, 60));
        assertEquals(23, SumLimit.sumLimit(23, 80));
        assertEquals(9001, SumLimit.sumLimit(9000, 1));
        assertEquals(90000001, SumLimit.sumLimit(90000000, 1));
        assertEquals(9000, SumLimit.sumLimit(9000, 1000));
        
        System.out.println("OK");
    }
}