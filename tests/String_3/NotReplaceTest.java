package String_3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NotReplaceTest {
    @Test
    void notReplaceTest() {
        System.out.print("Testing notReplace... ");

        assertEquals("is not test", NotReplace.notReplace("is test"));
        assertEquals("is not-is not", NotReplace.notReplace("is-is"));
        assertEquals("This is not right", NotReplace.notReplace("This is right"));
        assertEquals("This is not isabell", NotReplace.notReplace("This is isabell"));
        assertEquals("", NotReplace.notReplace(""));
        assertEquals("is not", NotReplace.notReplace("is"));
        assertEquals("isis", NotReplace.notReplace("isis"));
        assertEquals("Dis is not bliss is not", NotReplace.notReplace("Dis is bliss is"));
        assertEquals("is not his", NotReplace.notReplace("is his"));
        assertEquals("xis yis", NotReplace.notReplace("xis yis"));
        assertEquals("AAAis is not", NotReplace.notReplace("AAAis is"));

        System.out.println("OK");
    }
}