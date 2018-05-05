package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortaSumTest {
    @Test
    void sortaSumTest() {
        System.out.print("Testing sortaSum... ");

        assertEquals(7, SortaSum.sortaSum(3, 4));
        assertEquals(20, SortaSum.sortaSum(9, 4));
        assertEquals(21, SortaSum.sortaSum(10, 11));
        assertEquals(9, SortaSum.sortaSum(12, -3));
        assertEquals(9, SortaSum.sortaSum(-3, 12));
        assertEquals(9, SortaSum.sortaSum(4, 5));
        assertEquals(20, SortaSum.sortaSum(4, 6));
        assertEquals(21, SortaSum.sortaSum(14, 7));
        assertEquals(20, SortaSum.sortaSum(14, 6));

        System.out.println("OK");
    }
}