package String_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ZipZapTest {
    @Test
    void zipZapTest() {
        System.out.print("Testing zipZap... ");

        assertEquals("zpXzp", ZipZap.zipZap("zipXzap"));
        assertEquals("zpzp", ZipZap.zipZap("zopzop"));
        assertEquals("zzzpzp", ZipZap.zipZap("zzzopzop"));
        assertEquals("zibzp", ZipZap.zipZap("zibzap"));
        assertEquals("zp", ZipZap.zipZap("zip"));
        assertEquals("zi", ZipZap.zipZap("zi"));
        assertEquals("z", ZipZap.zipZap("z"));
        assertEquals("", ZipZap.zipZap(""));
        assertEquals("zp", ZipZap.zipZap("zzp"));
        assertEquals("abcppp", ZipZap.zipZap("abcppp"));
        assertEquals("azbcppp", ZipZap.zipZap("azbcppp"));
        assertEquals("azbcpzp", ZipZap.zipZap("azbcpzpp"));

        System.out.println("OK");
    }
}