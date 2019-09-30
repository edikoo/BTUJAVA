import java.util.Scanner;

/**
 * B
 */
public class B extends A{

    int y = 0;

    public void SetY()
    {
        Scanner myBtuObject = new Scanner(System.in);
        y = myBtuObject.nextInt();
    }

    public int returnXY()
    {
        return x+y;
    }


    
}