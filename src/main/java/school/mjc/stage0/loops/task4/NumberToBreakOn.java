package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {

        for (int i = 1; i <= numberToGoUntil; i++) {
            if (numberToGoUntil < toBreakWith && i == 1) {
                System.out.println("iterating till the end");
            }
            if (i > toBreakWith) {
                break;
            }
            System.out.println(i);

        }
    }
}
