package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WithoutDoublesTest {
    @Test
    void withoutDoublesTest() {
        System.out.print("Testing withoutDoubles... ");

        assertEquals(5, WithoutDoubles.withoutDoubles(2, 3, true));
        assertEquals(7, WithoutDoubles.withoutDoubles(3, 3, true));
        assertEquals(6, WithoutDoubles.withoutDoubles(3, 3, false));
        assertEquals(5, WithoutDoubles.withoutDoubles(2, 3, false));
        assertEquals(9, WithoutDoubles.withoutDoubles(5, 4, true));
        assertEquals(9, WithoutDoubles.withoutDoubles(5, 4, false));
        assertEquals(11, WithoutDoubles.withoutDoubles(5, 5, true));
        assertEquals(10, WithoutDoubles.withoutDoubles(5, 5, false));
        assertEquals(7, WithoutDoubles.withoutDoubles(6, 6, true));
        assertEquals(12, WithoutDoubles.withoutDoubles(6, 6, false));
        assertEquals(7, WithoutDoubles.withoutDoubles(1, 6, true));
        assertEquals(7, WithoutDoubles.withoutDoubles(6, 1, false));
        
        System.out.println("OK");
    }
}