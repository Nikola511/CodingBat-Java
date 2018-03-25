package String_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GetSandwichTest {
    @Test
    void getSandwichTest() {
        System.out.print("Testing getSandwich... ");

        assertEquals("jam", GetSandwich.getSandwich("breadjambread"));
        assertEquals("jam", GetSandwich.getSandwich("xxbreadjambreadyy"));
        assertEquals("", GetSandwich.getSandwich("xxbreadyy"));
        assertEquals("breadjam", GetSandwich.getSandwich("xxbreadbreadjambreadyy"));
        assertEquals("A", GetSandwich.getSandwich("breadAbread"));
        assertEquals("", GetSandwich.getSandwich("breadbread"));
        assertEquals("", GetSandwich.getSandwich("abcbreaz"));
        assertEquals("", GetSandwich.getSandwich("xyz"));
        assertEquals("", GetSandwich.getSandwich(""));
        assertEquals("breax", GetSandwich.getSandwich("breadbreaxbread"));
        assertEquals("y", GetSandwich.getSandwich("breaxbreadybread"));
        assertEquals("breadbread", GetSandwich.getSandwich("breadbreadbreadbread"));

        System.out.println("OK");
    }
}