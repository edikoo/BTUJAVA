import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String language;
        String parametrs;
        String generatedWord = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("აირჩიეთ ენა : ");
        language = scanner.nextLine();
        Scanner sc = new Scanner(System.in);
        parametrs = sc.nextLine();
        String[] par = parametrs.split("-");


        davaleba n = new davaleba();


        int number_of_p = n.checkIfexist(1,2,par);
        int start_number_of_s = n.checkIfexist(3,5,par);
        int end_number_of_s = n.checkIfexist(4,7,par);
        int start_number_of_w = n.checkIfexist(6,7,par);
        int end_number_of_w = n.checkIfexist(7,9,par);

        
        for(int i = 0; i<number_of_p; i++)
        {
            String stringLang = n.generateAlf(language);
            n.generateWord(start_number_of_w,end_number_of_w,start_number_of_s,end_number_of_s, stringLang);
        }

    }

}
