/**
 * C
 */
public class C extends B{

    int z = 5;

    public double sashualoAritmetikuli()
    {
        return (x+y+z)/3;
    }

    public double sashualoGeometriuli()
    {
        return Math.sqrt(x*y*z);
    }
    
    public double maximum()
    {
        int temp = Math.max(x, y);
        return Math.max(temp,z);
    }
    
}