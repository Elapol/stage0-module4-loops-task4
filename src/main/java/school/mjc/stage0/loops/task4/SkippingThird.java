package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public static void main(String[] args){
        printUntilButThird(10);
    }
    public static void printUntilButThird(int lastPrinted) {
        for(int counter=1;counter<=lastPrinted;counter++){
            if(counter%3==0){
                continue;

            } System.out.println(counter);
        }

    }
}
