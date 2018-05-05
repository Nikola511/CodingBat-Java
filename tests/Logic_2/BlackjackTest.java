package Logic_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BlackjackTest {
    @Test
    void blackjackTest() {
        System.out.print("Testing blackjack... ");

        assertEquals(21, Blackjack.blackjack(19, 21));
        assertEquals(21, Blackjack.blackjack(21, 19));
        assertEquals(19, Blackjack.blackjack(19, 22));
        assertEquals(19, Blackjack.blackjack(22, 19));
        assertEquals(0, Blackjack.blackjack(22, 50));
        assertEquals(0, Blackjack.blackjack(22, 22));
        assertEquals(1, Blackjack.blackjack(33, 1));
        assertEquals(2, Blackjack.blackjack(1, 2));
        assertEquals(0, Blackjack.blackjack(34, 33));
        assertEquals(19, Blackjack.blackjack(17, 19));
        assertEquals(18, Blackjack.blackjack(18, 17));
        assertEquals(16, Blackjack.blackjack(16, 23));
        assertEquals(4, Blackjack.blackjack(3, 4));
        assertEquals(3, Blackjack.blackjack(3, 2));
        assertEquals(21, Blackjack.blackjack(21, 20));

        System.out.println("OK");
    }
}