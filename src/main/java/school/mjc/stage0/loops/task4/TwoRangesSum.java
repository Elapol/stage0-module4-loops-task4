package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public static void main(String[] args) {
        printSumOfTwoRanges(4, 7); ///
    }

    public static void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int countedSum;
        int skippedSum;
        int sum = 0;
        int sumL=0;
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else {
            for(int counterL=1;counterL<=numberToSkip; counterL++){
                skippedSum= counterL + sumL;
                sumL = skippedSum;
                if (counterL == numberToSkip) {
                    System.out.println("skipped sum is number " + skippedSum); }
            }
            for (int counter = numberToSkip+1; counter <= lastInRow; counter++) {
                    countedSum = counter + sum;
                    sum = countedSum;
                    if (counter == lastInRow) {
                        System.out.println("counted sum is number " + countedSum); }
                }
            }


        }
    }

