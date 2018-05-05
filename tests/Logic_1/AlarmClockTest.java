package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlarmClockTest {
    @Test
    void alarmClockTest() {
        System.out.print("Testing alarmClock... ");

        assertEquals("7:00", AlarmClock.alarmClock(1, false) );
        assertEquals("7:00", AlarmClock.alarmClock(5, false) );
        assertEquals("10:00", AlarmClock.alarmClock(0, false) );
        assertEquals("10:00", AlarmClock.alarmClock(6, false) );
        assertEquals("off", AlarmClock.alarmClock(0, true) );
        assertEquals("off", AlarmClock.alarmClock(6, true) );
        assertEquals("10:00", AlarmClock.alarmClock(1, true) );
        assertEquals("10:00", AlarmClock.alarmClock(3, true) );
        assertEquals("10:00", AlarmClock.alarmClock(5, true) );

        System.out.println("OK");
    }
}