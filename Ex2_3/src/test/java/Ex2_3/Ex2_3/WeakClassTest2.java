package Ex2_3.Ex2_3;

import static org.junit.Assert.*;
import org.junit.Test;

public class WeakClassTest2 {

    @Test
    public void testPositiveAWithNonZeroB() {
        WeakClass weakClass = new WeakClass();
        assertEquals(2, weakClass.weakMethod1(6, 3)); // כיסוי לפסוקית שבה b != 0
    }

    @Test
    public void testNegativeA() {
        WeakClass weakClass = new WeakClass();
        assertEquals(-10, weakClass.weakMethod1(-2, 5));
    }
}
