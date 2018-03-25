package String_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CatDogTest {
    @Test
    void catDogTest() {
        System.out.print("Testing catDog... ");

        assertTrue(CatDog.catDog("catdog") );
        assertFalse(CatDog.catDog("catcat") );
        assertTrue(CatDog.catDog("1cat1cadodog") );
        assertFalse(CatDog.catDog("catxxdogxxxdog") );
        assertTrue(CatDog.catDog("catxdogxdogxcat") );
        assertFalse(CatDog.catDog("catxdogxdogxca") );
        assertFalse(CatDog.catDog("dogdogcat") );
        assertTrue(CatDog.catDog("dogogcat") );
        assertFalse(CatDog.catDog("dog") );
        assertFalse(CatDog.catDog("cat") );
        assertTrue(CatDog.catDog("ca") );
        assertTrue(CatDog.catDog("c") );
        assertTrue(CatDog.catDog("") );

        System.out.println("OK");
    }
}