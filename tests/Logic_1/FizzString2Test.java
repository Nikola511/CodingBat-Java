package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzString2Test {
    @Test
    void fizzString2Test() {
        System.out.print("Testing fizzString2... ");

        assertEquals("1!", FizzString2.fizzString2(1));
        assertEquals("2!", FizzString2.fizzString2(2));
        assertEquals("Fizz!", FizzString2.fizzString2(3));
        assertEquals("4!", FizzString2.fizzString2(4));
        assertEquals("Buzz!", FizzString2.fizzString2(5));
        assertEquals("Fizz!", FizzString2.fizzString2(6));
        assertEquals("7!", FizzString2.fizzString2(7));
        assertEquals("8!", FizzString2.fizzString2(8));
        assertEquals("Fizz!", FizzString2.fizzString2(9));
        assertEquals("FizzBuzz!", FizzString2.fizzString2(15));
        assertEquals("16!", FizzString2.fizzString2(16));
        assertEquals("Fizz!", FizzString2.fizzString2(18));
        assertEquals("19!", FizzString2.fizzString2(19));
        assertEquals("Fizz!", FizzString2.fizzString2(21));
        assertEquals("44!", FizzString2.fizzString2(44));
        assertEquals("FizzBuzz!", FizzString2.fizzString2(45));
        assertEquals("Buzz!", FizzString2.fizzString2(100));

        System.out.println("OK");
    }
}