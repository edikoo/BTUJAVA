import java.util.Scanner;
import java.util.Random;
/**
 * B
 */
public class B extends A{

    double a,b = 0;

    public void Bpirveli()
    {
        Scanner myBtuObject = new Scanner(System.in);
        a = myBtuObject.nextDouble();
        b = myBtuObject.nextDouble();
    }


    public void Bmeore()
    {
        if(a > b)
        {
            double temp = b;
            b = a;
            a = temp;
        }
    }

    public void Bmesame()
    {
        
        Random rand = new Random();
                //min + (max - min) * rand.nextDouble();
        double rand_int1 = a + (b - a) * rand.nextDouble(); 
        x = rand_int1;
    }


}