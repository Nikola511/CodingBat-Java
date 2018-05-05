package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateFashionTest {
    @Test
    void dateFashionTest() {
        System.out.print("Testing dateFashion... ");

        assertEquals(2, DateFashion.dateFashion(5, 10));
        assertEquals(0, DateFashion.dateFashion(5, 2));
        assertEquals(1, DateFashion.dateFashion(5, 5));
        assertEquals(1, DateFashion.dateFashion(3, 3));
        assertEquals(0, DateFashion.dateFashion(10, 2));
        assertEquals(0, DateFashion.dateFashion(2, 9));
        assertEquals(2, DateFashion.dateFashion(9, 9));
        assertEquals(2, DateFashion.dateFashion(10, 5));
        assertEquals(0, DateFashion.dateFashion(2, 2));
        assertEquals(1, DateFashion.dateFashion(3, 7));
        assertEquals(0, DateFashion.dateFashion(2, 7));
        assertEquals(0, DateFashion.dateFashion(6, 2));

        System.out.println("OK");
    }
}