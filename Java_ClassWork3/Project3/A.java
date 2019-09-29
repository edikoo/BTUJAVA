import java.util.Scanner;
import java.util.Random;
/**
 * A
 */
public class A {

    int[] m = new int[10];

    public void pirveli()
    {
        Scanner MyObjectBtu = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            m[i] = MyObjectBtu.nextInt();
        }
    }

    public void meore()
    {
        Random aRandom = new Random();
        for (int i = 0; i < 10; i++) {
            m[i] = aRandom.nextInt(15);
        }
    }

    public int mesame()
    {
        //გვიბრუნებს იმ ელემენტებს რომელიც თავის ინდექსზე ნაკლებია
        int sum = 0;
        for(int i = 0; i <= m.length; i++)
        {
            if(m[i] < i)
            {
                sum += m[i];
            }
        }

        return sum;
    }

    public int meotxe()
    {
        /*
        გვიბრუნებს იმ ელემენტების ინდექსების ნამრავლს, რომლის მნი-
        შვნელობა თავის ინდექსზე მეტია.
        */
        int sum = 1;
        for(int i = 0; i <= m.length; i++)
        {
            if(m[i] > i)
            {
                sum *= i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        A a = new A();
        //a.pirveli();
        //a.meore();
        //System.out.println(a.mesame());
        //System.out.println(a.meotxe());
    }
}