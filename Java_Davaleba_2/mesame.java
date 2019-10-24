import java.util.*; 
import java.util.HashMap;
/**
 * mesame
 */
public class mesame implements interfaceForMesame{

    int a = 10;
    int b = 2123311222;

    public static void main(String[] args) {
        mesame ms = new mesame();
        System.out.println(ms.meotxe());
    }
    
    public void pirveli()
    {

        int b = this.b;

        for(int a = this.a; a<b; a++)
        {
            System.out.println(a);
        }
    }

    public void meore()
    {
        for(int x = 1; x<=this.a; x++)
        {
            if(this.a % x == 0)
            {
                System.out.println(x);
            }
        }
    }

    public void mesamee()
    {

        for (int i = 1; i<=this.b; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }

    }

    public int meotxe()
    {
        int n = 0;  
        int rVal = 0;
        HashMap<Integer, Integer> cap = new HashMap(); 
        while(this.b > 0)
        {
            n = this.b % 10;
            if(cap.containsKey(n))
            {
                cap.put(n, cap.get(n) + 1);
            }
            else
            {
                cap.put(n,1);
            }
            this.b = this.b / 10;
        }
        
        int max = Collections.max(cap.values());
        

        for (Map.Entry<Integer, Integer> entry : cap.entrySet()) {
            if (entry.getValue()==max) {
                rVal = entry.getKey();
                break;
            }
        }
        
        return rVal;
    }

    public boolean isPrime(int num) 
    { 
        if (num <= 1) 
            return false; 
       
        for (int i = 2; i < num; i++) 
            if (num % i == 0) 
                return false; 
       
        return true; 
    } 

}