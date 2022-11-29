package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int conter = 0;
        while (conter<=printTillInclusive){
            if(conter%2==0)
            {
                System.out.println(conter);
            }
            conter++;
        }
    }
}
