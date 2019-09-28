import java.util.Scanner;
/**
 * C
 */
public class B extends A{

    int y;

    public void InsertPirveli()
    {
        Scanner MyObjectBtu = new Scanner(System.in);
        y = MyObjectBtu.nextInt();
    }
    public int GamotanaMeore()
    {
        return y + x;
    }


}