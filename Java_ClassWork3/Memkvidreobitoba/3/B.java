/**
 * B
 */
public class B extends A{

    public double Bpirveli()
    {
        return (y-x)/3;
    }


    public double Bmeore()
    {
        x = Math.pow(x, 2);
        return (x+2*y)/5;
    }

    public void Bmesame()
    {
        
        System.out.println(x);
    }

    public int[] returnAclassVariables(){
        int number1 = x;
        int number2 = y;
        return new int[] {number1, number2};
    }

    public void returnAclassMeoreMethod()
    {
        super.meore();
    }

    

}