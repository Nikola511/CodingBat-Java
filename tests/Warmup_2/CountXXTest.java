package Warmup_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountXXTest {
    @Test
    void countXXTest() {
        System.out.print("Testing countXX... ");
        assertEquals(1, CountXX.countXX("abcxx"));
        assertEquals(2, CountXX.countXX("xxx"));
        assertEquals(3, CountXX.countXX("xxxx"));
        assertEquals(0, CountXX.countXX("abc"));
        assertEquals(0, CountXX.countXX("Hello there"));
        assertEquals(2, CountXX.countXX("Hexxo thxxe"));
        assertEquals(0, CountXX.countXX(""));
        assertEquals(0, CountXX.countXX("Kittens"));
        assertEquals(2, CountXX.countXX("Kittensxxx"));
        System.out.println("OK");
    }
}