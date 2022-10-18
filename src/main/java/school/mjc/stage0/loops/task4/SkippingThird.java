package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {

        int n = 1;
        for (int i = 1; i <= lastPrinted; i++) {
            if (n == 3) {
                n = 1;
                continue;
            }
            System.out.println(i);
            n++;
        }
    }
}
