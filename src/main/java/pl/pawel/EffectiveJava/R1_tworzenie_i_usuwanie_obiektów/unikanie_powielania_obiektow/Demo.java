package pl.pawel.EffectiveJava.R1_tworzenie_i_usuwanie_obiektów.unikanie_powielania_obiektow;

import java.util.concurrent.TimeUnit;

public class Demo {

    public static void main(String[] args) {
        System.out.println("XII is Roman? :" + RomanNumerals.isRoman("XII"));
        System.out.println("XTI is Roman? :" + RomanNumerals.isRoman("XTI"));

        long start = System.currentTimeMillis();
        Long sum = 0L;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long stop = System.currentTimeMillis();

        System.out.println("SUMA intów (zmienna typu Long): " + sum + "\t czas wykonania "+ (stop-start) + " milisekund");

        start = System.currentTimeMillis();
        //Użycie typu prostego kilkuktortnie przyspiesa operację
        long sum2 = 0L;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum2 += i;
        }
        stop = System.currentTimeMillis();
        System.out.println("SUMA intów (zmienna typu long): " + sum2 + "\t czas wykonania "+ (stop-start) + " milisekund");

    }
}
