package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NearTenTest {
    @Test
    void nearTenTest() {
        System.out.print("Testing nearTen... ");

        assertTrue(NearTen.nearTen(12));
        assertFalse(NearTen.nearTen(17));
        assertTrue(NearTen.nearTen(19));
        assertTrue(NearTen.nearTen(31));
        assertFalse(NearTen.nearTen(6));
        assertTrue(NearTen.nearTen(10));
        assertTrue(NearTen.nearTen(11));
        assertTrue(NearTen.nearTen(21));
        assertTrue(NearTen.nearTen(22));
        assertFalse(NearTen.nearTen(23));
        assertFalse(NearTen.nearTen(54));
        assertFalse(NearTen.nearTen(155));
        assertTrue(NearTen.nearTen(158));
        assertFalse(NearTen.nearTen(3));
        assertTrue(NearTen.nearTen(1));

        System.out.println("OK");
    }
}