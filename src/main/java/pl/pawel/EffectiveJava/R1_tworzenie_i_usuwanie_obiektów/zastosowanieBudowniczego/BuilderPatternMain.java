package pl.pawel.EffectiveJava.R1_tworzenie_i_usuwanie_obiektów.zastosowanieBudowniczego;

import java.util.Arrays;

public class BuilderPatternMain {
    public static void main(String[] args) {
        NutricionFacts cola = new NutricionFacts.Builder(280, 80).calories(10).sodium(10)
                .carbohydrate(23).build();

        System.out.println(cola);
    }
}
