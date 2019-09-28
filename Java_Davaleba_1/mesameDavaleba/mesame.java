import java.util.Scanner;
import java.util.Random;
/**
 * mesame
 */
public class mesame {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int a = myScanner.nextInt();

        int b = myScanner.nextInt();

        Random aRandom = new Random();

        int even = 0;
        int odd = 0;
        int sumEven = 0;
        int sumOdd = 0;

        if(a > b)
        {
            int temp = a;
            a = b;
            b = temp;
        }

        for(int i = 1; i<=40; i++ )
        {
            int randNumber = aRandom.nextInt(b) + a;

            if(randNumber % 2 == 0)
            {
                even += 1;
                sumEven += randNumber;
            }
            else
            {
                odd += 1;
                sumOdd += randNumber;
            }
        }

        System.out.println("ლუწი -"+ even);
        System.out.println("კენტი -"+ odd);

        System.out.println("ლუწი რიცხვების ჯამი -"+ sumEven);
        System.out.println("კენტი რიცხვების ჯამი -"+ sumOdd);

        
        
        for(int x = 1; x<=5; x++ )
        {
            if(sumEven > sumOdd)
            {
                System.out.println(aRandom.nextInt(sumEven) + sumOdd);
            }
            else
            {
                System.out.println(aRandom.nextInt(sumOdd) + sumEven);
            }
            
        }
    }
}