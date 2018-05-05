package Logic_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LuckySumTest {
    @Test
    void luckySumTest() {
        System.out.print("Testing luckySum... ");

        assertEquals(6, LuckySum.luckySum(1, 2, 3));
        assertEquals(3, LuckySum.luckySum(1, 2, 13));
        assertEquals(1, LuckySum.luckySum(1, 13, 3));
        assertEquals(1, LuckySum.luckySum(1, 13, 13));
        assertEquals(13, LuckySum.luckySum(6, 5, 2));
        assertEquals(0, LuckySum.luckySum(13, 2, 3));
        assertEquals(0, LuckySum.luckySum(13, 2, 13));
        assertEquals(0, LuckySum.luckySum(13, 13, 2));
        assertEquals(13, LuckySum.luckySum(9, 4, 13));
        assertEquals(8, LuckySum.luckySum(8, 13, 2));
        assertEquals(10, LuckySum.luckySum(7, 2, 1));
        assertEquals(6, LuckySum.luckySum(3, 3, 13));
        
        System.out.println("OK");
    }
}