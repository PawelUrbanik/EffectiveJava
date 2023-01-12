package pl.pawel.EffectiveJava.R1_tworzenie_i_usuwanie_obiektów.blokowanie_konstruktora;

public class UtilityClass {

    //Blocked
    private UtilityClass() {
        throw new AssertionError();
    }

    private static String name = "Pawel";

    public static String getName() {
        return name;
    }


    public static void printName() {
        System.out.println("Name from utility class: " + name);
    }
}
