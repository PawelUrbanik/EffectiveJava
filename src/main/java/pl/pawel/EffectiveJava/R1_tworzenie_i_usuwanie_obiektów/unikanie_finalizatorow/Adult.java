package pl.pawel.EffectiveJava.R1_tworzenie_i_usuwanie_obiektów.unikanie_finalizatorow;

public class Adult {

    public static void main(String[] args) {
        try (var myRoom = new Room(7)){
            System.out.println("Do widzenia");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
