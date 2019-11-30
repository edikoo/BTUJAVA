package com.company;

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


        Main n = new Main();


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

    public void generateWord(int start_number_of_w, int end_number_of_w, int start_number_of_s, int end_number_of_s, String lang)
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
