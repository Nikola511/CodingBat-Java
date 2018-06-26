package String_3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxBlockTest {
    @Test
    void maxBlockTest() {
        System.out.print("Testing maxBlock... ");

        assertEquals(2, MaxBlock.maxBlock("hoopla"));
        assertEquals(3, MaxBlock.maxBlock("abbCCCddBBBxx"));
        assertEquals(0, MaxBlock.maxBlock(""));
        assertEquals(1, MaxBlock.maxBlock("xyz"));
        assertEquals(2, MaxBlock.maxBlock("xxyz"));
        assertEquals(2, MaxBlock.maxBlock("xyzz"));
        assertEquals(3, MaxBlock.maxBlock("abbbcbbbxbbbx"));
        assertEquals(3, MaxBlock.maxBlock("XXBBBbbxx"));
        assertEquals(4, MaxBlock.maxBlock("XXBBBBbbxx"));
        assertEquals(4, MaxBlock.maxBlock("XXBBBbbxxXXXX"));
        assertEquals(4, MaxBlock.maxBlock("XX2222BBBbbXX2222"));

        System.out.println("OK");
    }
}