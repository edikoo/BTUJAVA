import java.util.Scanner;
/**
 * C
 */
public class C {

    int a,b,c;
    public void Insert()
    {
         Scanner MyObjectBtu = new Scanner(System.in);
         a = MyObjectBtu.nextInt();
         b = MyObjectBtu.nextInt();
         c = MyObjectBtu.nextInt();
    }

    public int Meore()
    {
        return (a % 10); 
    }

    public int Mesame()
    {
        while (b >= 10) b /= 10; 
        return b; 
    }

    public int Meotxe()
    {
        int n,m = 0;
        while(c > 0)
        {
            n = c % 10;
            m += n;
            c = c/10;

        }
        return m;
    }

    public int MexuteReturn()
    {
        return Meore() * Mesame();
    }

    public void Mexute()
    {
        System.out.println(MexuteReturn());
    }
    

    public void Meeqvse()
    {
       System.out.println(Mesame() + MexuteReturn());
    }

    public static void main(String[] args) {
        C c = new C();
        c.Insert();
        System.out.println(c.Meore());
        //System.out.println(c.Mesame());
        //System.out.println(c.Meotxe());
        //c.Mexute();
        c.Meeqvse();
    }
}