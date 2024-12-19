package Ex2_3.Ex2_3;
import static org.junit.Assert.*;
import org.junit.Test;

public class WeakClassTest1 {

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        WeakClass weakClass = new WeakClass();
        weakClass.weakMethod1(5, 0); // יגרום לתקלת חלוקה באפס
    }

    @Test
    public void testNegativeA() {
        WeakClass weakClass = new WeakClass();
        assertEquals(-10, weakClass.weakMethod1(-2, 5));
    }
}
