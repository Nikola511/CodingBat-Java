package Warmup_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DelDelTest {
    @Test
    void delDelTest() {
        System.out.print("Testing delDel... ");
        assertEquals("abc", DelDel.delDel("adelbc"));
        assertEquals("aHello", DelDel.delDel("adelHello"));
        assertEquals("adedbc", DelDel.delDel("adedbc"));
        assertEquals("abcdel", DelDel.delDel("abcdel"));
        assertEquals("add", DelDel.delDel("add"));
        assertEquals("ad", DelDel.delDel("ad"));
        assertEquals("a", DelDel.delDel("a"));
        assertEquals("", DelDel.delDel(""));
        assertEquals("del", DelDel.delDel("del"));
        assertEquals("a", DelDel.delDel("adel"));
        assertEquals("aadelbb", DelDel.delDel("aadelbb"));
        System.out.println("OK");
    }
}