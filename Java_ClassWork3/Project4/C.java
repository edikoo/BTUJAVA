/**
 * C
 */
public class C {

    double a,b;

    public double pirveli()
    {
        a = Math.pow(a, 2);
        return (4*a/b) - 1;
    }

    public double meore()
    {
        a = Math.pow(a,3);
        b = Math.pow(b,2);
        return (3*a/2)-b;
    }



    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.pirveli());
        System.out.println(c.meore());
    }
}