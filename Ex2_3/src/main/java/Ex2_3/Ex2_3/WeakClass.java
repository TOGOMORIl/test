package Ex2_3.Ex2_3;
public class WeakClass {

    public int weakMethod1(int a, int b) {
        if (a > 0) {
            if (b != 0) {
                return a / b; // תקלת חלוקה באפס במקרה שבו b הוא אפס
            } else {
                return -1; // מקרה מיוחד כאשר b הוא אפס
            }
        } else {
            return a * b; // פעולה אחרת כאשר a אינו חיובי
        }
    }
}
