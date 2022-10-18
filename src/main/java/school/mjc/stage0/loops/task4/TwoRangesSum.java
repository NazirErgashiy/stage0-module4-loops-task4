package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {

        int n = 1;
        int sum = 0;
        for (int i = 1; i <= lastInRow; i++) {
            if (n == numberToSkip) {
                n = 0;
                sum += i;
            }
            n++;
            if (i == lastInRow) {
                System.out.println(sum);
            }
        }

    }
}
