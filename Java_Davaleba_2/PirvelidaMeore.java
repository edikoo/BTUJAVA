import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * PirvelidaMeore
 */
public class PirvelidaMeore {

    String path = "C:\\Users\\HOME\\Desktop\\davaleba_2\\function.txt";

    public static void main(String[] args) {

        PirvelidaMeore pr = new PirvelidaMeore();
        pr.pirveli();
        pr.meore();

    }

    public void meore()
    {
        ArrayList<Double> arr = new ArrayList<Double>();
        try {
            FileReader fr = new FileReader(this.path); 

            Scanner input = new Scanner(fr);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                double x = Double.parseDouble(line);
                arr.add(x);
            }
            input.close();

        } catch (Exception e) {

        }
        Collections.sort(arr);
        System.out.println("მინიმუმი - " + arr.get(0)); 
        System.out.println("მაქსიმუმი - " + arr.get(arr.size()-1)); 

    }

    public void pirveli()
    {
        double min = 1, max = 2;

        while (min<=max) {
            String s = String.format("%.2f",min);
            double x = Double.parseDouble(s);
            
            double y = Math.pow(x, 2)+2*x+3;

            try {
                File file = new File(this.path);
                FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(String.format("%.2f",y));
                bw.write(System.lineSeparator());
                bw.close();
            } catch (Exception e) {
                
            }

            min+=0.01;
        }
    }
}