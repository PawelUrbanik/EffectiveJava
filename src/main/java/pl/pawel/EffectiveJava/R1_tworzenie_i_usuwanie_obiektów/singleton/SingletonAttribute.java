package pl.pawel.EffectiveJava.R1_tworzenie_i_usuwanie_obiektów.singleton;

public class SingletonAttribute {

    public static final SingletonAttribute INSTANCE = new SingletonAttribute();
    private SingletonAttribute() {}
}
