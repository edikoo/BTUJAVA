import java.util.Random;
import java.util.Scanner;

/**
 * A
 */
public class A {

    int x,y = 0;

    
    public void pirveli()
    {
        Scanner myBtuObject = new Scanner(System.in);
        x = myBtuObject.nextInt();
        y = myBtuObject.nextInt();
    }
    public void meore()
    {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(67) + 12; 
        int rand_int2 = rand.nextInt(67) + 12;
        x = rand_int1;
        y = rand_int2;
    }

    public void mesame()
    {
        System.out.println(y);
    }

}