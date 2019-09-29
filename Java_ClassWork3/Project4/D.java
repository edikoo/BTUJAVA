/**
 * D
 */
public class D {

    double a,b,z;

    public double pirveli()
    {
        b = Math.pow(b, 3);
        return (a+b-7)/(z+8);
    }

    public double meore()
    {
        b = Math.pow(b, 3);
        return (a+z-b)/(z*a*b);
    }

    public double mesame()
    {
        return ((a*z)-b)/(z*b);
    }

    public static void main(String[] args) {
        D d = new D();
        //System.out.println(d.pirveli());
        //System.out.println(d.meore());
        //System.out.println(d.mesame());
    }
}