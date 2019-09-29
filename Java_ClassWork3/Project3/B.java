import java.util.Scanner;
import java.util.Random;
/**
 * B
 */
public class B{

    float [] m = new float [12];

    public void pirveli()
    {
        Scanner MyObjectBtu = new Scanner(System.in);
        for (int i = 0; i < 12; i++) {
            m[i] = MyObjectBtu.nextFloat();
        }
    }

    public void meore()
    {
        Random aRandom = new Random();
        for (int i = 0; i < 12; i++) {
            m[i] = aRandom.nextFloat() * 15;
        }
    }

    public void mesame()
    {
        for(int i = 0; i <= m.length; i++)
        {
            if(m[i] > 7)
            {
                System.out.println("ინდექსი -"+i+", მნიშვნელობა -" + m[i]);
            }
        }

    }

    public float meotxe()
    {
        for(int i = 0; i < m.length; i++)
        {
            for (int j = i; j > 0; j--) 
            {
                if(m[j] > m[ j - 1])
                {
                    float temp = m[j];
                    m[j] = m[j - 1];
                    m[j - 1] = temp;
                }
            }
        }

        return m[0] - m[m.length - 1];
    }

    public static void main(String[] args) {
        B b = new B();
        b.pirveli();
        //b.meore();
        //System.out.println(b.mesame());
        System.out.println(b.meotxe());
    }
}