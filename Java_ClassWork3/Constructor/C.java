/**
 * B
 */
public class C {

    public int a,b,x;

    public C()
    {

    }
    
    public C(int Geta, int Getb, int Getx)
    {
        a = Geta;
        b = Getb;
        x = Getx;
    }

    public void pirveli()
    {
        if(a >= b)
        {
            int temp = a;
            a = b;
            b = temp;
            System.out.println("არ წარმოადგენს შუალედს");
        }
        else
        {
            System.out.println("წარმოადგენს შუალედს");
        }
    }

    public void meore()
    {
        if(x >= a && x <= b)
        {
            System.out.println("შუალედშია");
        }
        else
        {
            System.out.println("არ არის შუალედში");
        }
    }
    public static void main(String[] args) {
        C c = new C(2,3,4);
        c.pirveli();
        c.meore();
    }
}