package String_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EndOtherTest {
    @Test
    void endOtherTest() {
        System.out.print("Testing endOther... ");

        assertTrue(EndOther.endOther("Hiabc", "abc") );
        assertTrue(EndOther.endOther("AbC", "HiaBc") );
        assertTrue(EndOther.endOther("abc", "abXabc") );
        assertFalse(EndOther.endOther("Hiabc", "abcd") );
        assertTrue(EndOther.endOther("Hiabc", "bc") );
        assertFalse(EndOther.endOther("Hiabcx", "bc") );
        assertTrue(EndOther.endOther("abc", "abc") );
        assertTrue(EndOther.endOther("xyz", "12xyz") );
        assertFalse(EndOther.endOther("yz", "12xz") );
        assertTrue(EndOther.endOther("Z", "12xz") );
        assertTrue(EndOther.endOther("12", "12") );
        assertFalse(EndOther.endOther("abcXYZ", "abcDEF") );
        assertFalse(EndOther.endOther("ab", "ab12") );
        assertTrue(EndOther.endOther("ab", "12ab") );

        System.out.println("OK");
    }
}