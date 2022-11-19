package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public static void main(String[] args){
        printNumbersUntilWithBreakOn(6,5);
    }
    public static void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        for (int counter=1;counter<=numberToGoUntil;counter++){

            if(counter==toBreakWith){
                break;
            }

            if(numberToGoUntil==counter){ System.out.print("iterating till the end ");}
            System.out.println(counter);
        }

    }
}
