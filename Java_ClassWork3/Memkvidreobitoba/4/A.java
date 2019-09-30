import java.util.Random;
import java.util.Scanner;

/**
 * A
 */
public class A {

    double x,y = 0;

    
    public void pirveli()
    {
        Scanner myBtuObject = new Scanner(System.in);
        x = myBtuObject.nextDouble();
        y = myBtuObject.nextDouble();
    }
    public void meore()
    {
        Random rand = new Random();
                        //min + (max - min) * rand.nextDouble();
        double rand_int1 = 0 + (12 - 0) * rand.nextDouble(); 
        double rand_int2 = 0 + (12 - 0) * rand.nextDouble(); 
        x = rand_int1;
        y = rand_int2;
    }

    public void mesame()
    {
        System.out.println((y-3*x)/3);
    }

}