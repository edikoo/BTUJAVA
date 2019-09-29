/**
 * B
 */
public class B {

    public int X = 0;

    public B()
    {

    }
    
    public B(int x)
    {
        X = x;
    }

    public void pirveli()
    {
        if(X >= 5 && X <= 24)
        {
            System.out.println("შუალედშია");
        }
        else
        {
            System.out.println("არ არის შუალედში");
        }
    }
    public static void main(String[] args) {
        B b = new B(6);
        b.pirveli();
    }
}