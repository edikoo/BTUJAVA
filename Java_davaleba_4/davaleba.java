/**
 * davaleba
 */
import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;
public class davaleba {

    public int checkIfexist(int index, int defaultVal, String [] par)
    {
        try {
           return Integer.parseInt(par[index]);
        } catch ( IndexOutOfBoundsException e ) {
            
        } catch ( NumberFormatException e ) {
            
        }
        return defaultVal;
    }

    public String generateAlf(String lang)
    {
        String alphabet;
        switch(lang) {
            case "en":
                alphabet = "abcdefghijklmnopqrstuvwxyz";
                break;
            case "ru":
                alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
                break;
            case "ka":
                alphabet = "აბგდევზთიკლმნოპჟრსტუფქღყშჩცძწჭხჯჰ";
                break;
            default:
                alphabet = "abcdefghijklmnopqrstuvwxyz";
        }
        return  alphabet;
    }

    public void generateData(int start_number_of_w, int end_number_of_w, int start_number_of_s, int end_number_of_s, String lang)
    {
        Random random = new SecureRandom();
        StringBuilder sb;
        String Sentence = "";

        int rand_sentect = random.nextInt((end_number_of_s - start_number_of_s) + 1) + start_number_of_s;
        String characters = lang;

        for (int j = 0; j < end_number_of_s; j++)
        {
            int rand_word = random.nextInt((end_number_of_w - start_number_of_w) + 1) + start_number_of_w;
            sb = new StringBuilder(rand_word);
            for (int i = 0; i < rand_word; i++) {
                sb.append(characters.charAt(random.nextInt(characters.length())));
            }
            Sentence += sb + " ";

        }
        System.out.println(Sentence);

    }
}