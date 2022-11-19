package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public static void main(String[] args) {
        printSumOfTwoRanges(2, 6); /// 0+1+3+4+5+6=19
    }

    public static void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int countedSum;
        int sum = 0;
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger then the last");
        } else {
            for (int counter = 1; counter <= lastInRow; counter++) {
                if (counter != numberToSkip) {
                    countedSum = counter + sum;
                    sum = countedSum;
                    if (counter == lastInRow) {
                        System.out.println("counted sum is number " + countedSum); }
                }
            }
            System.out.println("skipped sum is number " + numberToSkip);

        }
    }
}
