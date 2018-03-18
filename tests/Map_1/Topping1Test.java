package Map_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class Topping1Test {
    @Test
    void topping1Test() {
        System.out.print("Testing topping1... ");
        Map<String, String> mapIn = new HashMap(), mapOut = new HashMap();

        mapIn.put("ice cream", "pea nuts");
        mapOut.put("bread", "butter"); mapOut.put("ice cream", "cherry");
        assertEquals(mapOut, Topping1.topping1(mapIn));

        mapIn.clear(); mapOut.clear();
        mapOut.put("bread", "butter");
        assertEquals(mapOut, Topping1.topping1(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("pancake", "syrup");
        mapOut.put("bread", "butter"); mapOut.put("pancake", "syrup");
        assertEquals(mapOut, Topping1.topping1(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("bread", "dirt"); mapIn.put("ice cream", "strawberries");
        mapOut.put("bread", "butter"); mapOut.put("ice cream", "cherry");
        assertEquals(mapOut, Topping1.topping1(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("bread", "jam"); mapIn.put("ice cream", "strawberries"); mapIn.put("salad", "oil");
        mapOut.put("bread", "butter"); mapOut.put("ice cream", "cherry"); mapOut.put("salad", "oil");
        assertEquals(mapOut, Topping1.topping1(mapIn));

        System.out.println("OK");
    }
}