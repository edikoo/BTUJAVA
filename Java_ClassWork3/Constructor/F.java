/**
 * F
 */
public class F {

    float x,y;

    public F()
    {

    }

    public F(float Setx)
    {
        x = Setx;
    }

    public F(float Setx, float Sety)
    {
        x = Setx;
        y = Sety;
    }

    public void pirveli()
    {

        while (x != y) 
        {
            if(x > y)
                x = x - y;
            else
                y = y - x;
        }
      
          System.out.println("GCD - " + y);
    }

    //მეორეც იგივეა რაც პირველი მეთოდი ამიტომ არ გავაკეთე
    public static void main(String[] args) {
        F f = new F(20,30);
        f.pirveli();
    }
}