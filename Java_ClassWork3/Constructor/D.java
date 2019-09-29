/**
 * D
 */
public class D {

    int x = 5 , y = 10;

    public D()
    {
        String className = this.getClass().getSimpleName(); 
        System.out.println("Hello "+className+" class");
    }

    public double pirveli()
    {
        if(x > ((0.2*x)+y) || x <= 0)
        {
            return (4*x)-y;
        }
        else
        {
            return 0;
        }
    } 

    public double meore()
    {
        if(y > ((0.2*x)-y) || y <= 0)
        {
            return (4*x)+y;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String[] args) {
        D d = new D();
        //System.out.println(d.pirveli());
        //System.out.println(d.meore());
    }
}