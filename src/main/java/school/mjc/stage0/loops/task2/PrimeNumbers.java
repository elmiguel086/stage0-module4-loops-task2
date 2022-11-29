package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if(printToInclusive==0 || printToInclusive==1 || printToInclusive==4)
        {
            //don't print
        }
        else
        {
            int count = 2;
            while (count<=printToInclusive) {
                boolean prim = true;

                int divisor = 2;

                while ((prim) && (divisor != count)) {
                    if ((count % divisor == 0)) {
                        prim = false;
                    } else {
                        divisor++;
                    }
                }
                if (prim) {
                    System.out.println(count);
                }
                count++;
            }
        }
    }
}
