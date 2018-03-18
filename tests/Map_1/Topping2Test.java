package Map_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class Topping2Test {
    @Test
    void topping2Test() {
        System.out.print("Testing topping2... ");
        Map<String, String> mapIn = new HashMap(), mapOut = new HashMap();

        mapIn.put("ice cream", "cherry");
        mapOut.put("yogurt", "cherry"); mapOut.put("ice cream", "cherry");
        assertEquals(mapOut, Topping2.topping2(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("spinach", "dirt"); mapIn.put("ice cream", "cherry");
        mapOut.put("yogurt", "cherry"); mapOut.put("spinach", "nuts"); mapOut.put("ice cream", "cherry");
        assertEquals(mapOut, Topping2.topping2(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("yogurt", "salt");
        mapOut.put("yogurt", "salt");
        assertEquals(mapOut, Topping2.topping2(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("yogurt", "salt"); mapIn.put("bread", "butter");
        mapOut.put("yogurt", "salt"); mapOut.put("bread", "butter");
        assertEquals(mapOut, Topping2.topping2(mapIn));

        mapIn.clear(); mapOut.clear();
        assertEquals(mapOut, Topping2.topping2(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("ice cream", "air"); mapIn.put("salad", "oil");
        mapOut.put("yogurt", "air"); mapOut.put("ice cream", "air"); mapOut.put("salad", "oil");
        assertEquals(mapOut, Topping2.topping2(mapIn));

        System.out.println("OK");
    }

}