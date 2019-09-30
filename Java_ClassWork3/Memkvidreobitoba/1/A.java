import java.util.Scanner;

/**
 * A
 */
public class A {

    int x = 0;

    public A()
    {
        System.out.println("hello My A Class");
    }
    
    public void pirveli()
    {
        Scanner myBtuObject = new Scanner(System.in);
        x = myBtuObject.nextInt();
    }
    public void meore()
    {
        System.out.println(x);
    }
    public void mesame()
    {
        if(x % 2 == 0)
        {
            System.out.println("ლუწია");
        }
        else
        {
            System.out.println("კენტია");
        }
    }
}