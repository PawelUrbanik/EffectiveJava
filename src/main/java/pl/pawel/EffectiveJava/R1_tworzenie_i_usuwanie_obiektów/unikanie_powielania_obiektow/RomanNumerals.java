package pl.pawel.EffectiveJava.R1_tworzenie_i_usuwanie_obiektów.unikanie_powielania_obiektow;

import java.util.regex.Pattern;

public class RomanNumerals {

    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD] |D?C{0,3})(X[CL] |L?X{0,3})(I[XC]|V?I{0,3})$"
    );

    static boolean isRoman(String s) {
        //kompilacja Pattern'u występuje tylko raz gdy pierwszy raz korzystamy z metody
        return ROMAN.matcher(s).matches();
    }
}
