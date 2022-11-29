package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if(multiplyByAndToInclusive==0)
        {
            // don't print anything.
        } else if (multiplyByAndToInclusive<0) {
            int conter = 0;
            while (conter>=multiplyByAndToInclusive)
            {
                System.out.println(conter*-multiplyByAndToInclusive);
                conter--;
            }
        }
        else
        {
            int counter = 0;
            while (counter<=multiplyByAndToInclusive){
                System.out.println(multiplyByAndToInclusive*counter++);
            }
        }
    }
}
