/**
 * B
 */
public class B {

    int n,y;

    public int pirveli()
    {
        n = 5;
        return 2*(n*n)+1;
    }

    public int meore()
    {
        n = 3;
        y = 2;

        y = (int) Math.pow(y, 3);
        n = (int) Math.pow(n, 2);
        return (3*y)-n;
    }

    public static void main(String[] args) {
        B b = new B();
        //System.out.println(b.pirveli());
        System.out.println(b.meore());
    }
}