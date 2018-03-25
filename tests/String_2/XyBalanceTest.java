package String_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class XyBalanceTest {
    @Test
    void xyBalanceTest() {
        System.out.print("Testing xyBalance... ");

        assertTrue(XyBalance.xyBalance("aaxbby"));
        assertFalse(XyBalance.xyBalance("aaxbb"));
        assertFalse(XyBalance.xyBalance("yaaxbb"));
        assertTrue(XyBalance.xyBalance("yaaxbby"));
        assertTrue(XyBalance.xyBalance("xaxxbby"));
        assertFalse(XyBalance.xyBalance("xaxxbbyx"));
        assertTrue(XyBalance.xyBalance("xxbxy"));
        assertFalse(XyBalance.xyBalance("xxbx"));
        assertTrue(XyBalance.xyBalance("bbb"));
        assertFalse(XyBalance.xyBalance("bxbb"));
        assertTrue(XyBalance.xyBalance("bxyb"));
        assertTrue(XyBalance.xyBalance("xy"));
        assertTrue(XyBalance.xyBalance("y"));
        assertFalse(XyBalance.xyBalance("x"));
        assertTrue(XyBalance.xyBalance(""));
        assertFalse(XyBalance.xyBalance("yxyxyxyx"));
        assertTrue(XyBalance.xyBalance("yxyxyxyxy"));
        assertTrue(XyBalance.xyBalance("12xabxxydxyxyzz"));

        System.out.println("OK");
    }
}