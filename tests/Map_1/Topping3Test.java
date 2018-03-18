package Map_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class Topping3Test {
    @Test
    void topping3Test() {
        System.out.print("Testing topping3... ");
        Map<String, String> mapIn = new HashMap(), mapOut = new HashMap();

        mapIn.put("potato", "ketchup");
        mapOut.put("potato", "ketchup"); mapOut.put("fries", "ketchup");
        assertEquals(mapOut, Topping3.topping3(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("potato", "butter");
        mapOut.put("potato", "butter"); mapOut.put("fries", "butter");
        assertEquals(mapOut, Topping3.topping3(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("salad", "oil"); mapIn.put("potato", "ketchup");
        mapOut.put("spinach", "oil"); mapOut.put("salad", "oil"); mapOut.put("potato", "ketchup"); mapOut.put("fries", "ketchup");
        assertEquals(mapOut, Topping3.topping3(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("toast", "butter"); mapIn.put("salad", "oil"); mapIn.put("potato", "ketchup");
        mapOut.put("toast", "butter"); mapOut.put("spinach", "oil"); mapOut.put("salad", "oil"); mapOut.put("potato", "ketchup"); mapOut.put("fries", "ketchup");
        assertEquals(mapOut, Topping3.topping3(mapIn));

        mapIn.clear(); mapOut.clear();
        assertEquals(mapOut, Topping3.topping3(mapIn));

        mapIn.clear(); mapOut.clear();
        mapIn.put("salad", "pepper"); mapIn.put("fries", "salt");
        mapOut.put("spinach", "pepper"); mapOut.put("salad", "pepper"); mapOut.put("fries", "salt");
        assertEquals(mapOut, Topping3.topping3(mapIn));

        System.out.println("OK");
    }
}