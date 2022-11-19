package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public static void main(String[] args) {
        printNumbersUntilWithBreakOn(7, 5);
    }

    public static void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (toBreakWith <= numberToGoUntil) {
            for (int counterB = 1; counterB <= toBreakWith; counterB++) {
                System.out.println(counterB);
            }
        } else {
            System.out.println("iterating till the end");
            for (int counter = 1; counter <= numberToGoUntil; counter++) {


                System.out.println(counter);
            }

        }
    }
}
