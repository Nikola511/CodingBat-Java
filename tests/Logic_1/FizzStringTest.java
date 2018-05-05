package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzStringTest {
    @Test
    void fizzStringTest() {
        System.out.print("Testing fizzString... ");

        assertEquals("Fizz", FizzString.fizzString("fig"));
        assertEquals("Buzz", FizzString.fizzString("dib"));
        assertEquals("FizzBuzz", FizzString.fizzString("fib"));
        assertEquals("abc", FizzString.fizzString("abc"));
        assertEquals("Fizz", FizzString.fizzString("fooo"));
        assertEquals("booo", FizzString.fizzString("booo"));
        assertEquals("Buzz", FizzString.fizzString("ooob"));
        assertEquals("FizzBuzz", FizzString.fizzString("fooob"));
        assertEquals("Fizz", FizzString.fizzString("f"));
        assertEquals("Buzz", FizzString.fizzString("b"));
        assertEquals("Buzz", FizzString.fizzString("abcb"));
        assertEquals("Hello", FizzString.fizzString("Hello"));
        assertEquals("Buzz", FizzString.fizzString("Hellob"));
        assertEquals("af", FizzString.fizzString("af"));
        assertEquals("bf", FizzString.fizzString("bf"));
        assertEquals("FizzBuzz", FizzString.fizzString("fb"));

        System.out.println("OK");
    }
}