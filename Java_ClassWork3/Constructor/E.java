/**
 * E
 */
public class E {

    float x = 0, y = 2;

    public E()
    {

    }

    public E(int Setx)
    {
        x = Setx;
    }

    public float pirveli()
    {
        if(y != 0)
        {
            return (x/y)+(x*y);
        }
        else if(x <= 0)
        {
            x = (float)Math.pow(x, 4);
            return x+y;
        }
        else
        {
            return 0;
        }
    }

    public float meore()
    {
        return Math.min(x, y);
    }

    public static void main(String[] args) {
        E e = new E(3);
        System.out.println(e.pirveli());
        //System.out.println(e.meore());
    }
}