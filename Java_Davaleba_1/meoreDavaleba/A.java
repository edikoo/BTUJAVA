import java.util.Scanner;
/**
 * C
 */
public class A {

    int x;
    public A()
    {
        System.out.println("hello");
    }

    public void Pirveli()
    {
        Scanner MyObjectBtu = new Scanner(System.in);
        x = MyObjectBtu.nextInt();
    }

    public void Meore()
    {
        System.out.println(x + 12);
    }

    public void Mesame()
    {
        if(x % 2 == 0)
            System.out.println("ლუწია");
        else
            System.out.println("კენტია");
    }


}