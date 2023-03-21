package pl.pawel.EffectiveJava.R1_tworzenie_i_usuwanie_obiektów.unikanie_finalizatorow;

public class Teenager {

    public static void main(String[] args) {
        new Room(99);
        System.out.println("Nara");
        System.gc();
    }
}
