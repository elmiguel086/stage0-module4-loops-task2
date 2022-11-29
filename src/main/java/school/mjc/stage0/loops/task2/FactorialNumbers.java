package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        while (i<=printToInclusive)
        {
            System.out.println(factorial(i));
            i++;
        }
    }
    public int factorial(int num){
        if(num>=1)
            return num * factorial(num -1);
        else
            return 1;
    }
}
