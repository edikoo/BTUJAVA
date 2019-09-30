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
        System.out.println(x);
    }

    public void mesame()
    {
        System.out.println(y);
    }

}