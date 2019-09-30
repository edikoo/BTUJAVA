/**
 * C
 */
public class C extends B{

    int z = 3,r = 5;

    public double Cpirveli()
    {
        int Max1 = Math.max(x, y);
        int Max2 = Math.max(Max1, z);
        return Math.max(Max2,r);
    }

    public double Cmeore()
    {
        x = (int)Math.pow(x, 2);
        return (x+2*y)/(z-r);
    }

    public double Cmesame()
    {
        meore();
        return ((y-x)/3)+(r/(z+4));
    }
}