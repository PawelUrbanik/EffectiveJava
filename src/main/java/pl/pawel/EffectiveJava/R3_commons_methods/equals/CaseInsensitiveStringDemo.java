package pl.pawel.EffectiveJava.R3_commons_methods.equals;

public class CaseInsensitiveStringDemo {
    public static void main(String[] args) {

        CaseInsensitiveString caseInsensitiveString = new CaseInsensitiveString("Polski");
        String string = "polski";

        /**
         * The rule of symmetry has been violated. Result of this method is different.
         */
        System.out.println("Object eq string: " + caseInsensitiveString.equals(string));
        System.out.println("String eq object: "+ string.equals(caseInsensitiveString) );
    }
}
