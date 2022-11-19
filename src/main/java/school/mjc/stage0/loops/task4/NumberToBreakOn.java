package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public static void main(String[] args){
        printNumbersUntilWithBreakOn(6,5);
    }
    public static void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        System.out.println("iterating till the end");
        for (int counter=1;counter<=numberToGoUntil;counter++){

            if(counter==toBreakWith){
                break;
            }
            System.out.println(counter);
        }

    }
}
