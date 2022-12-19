package pl.pawel.EffectiveJava.R1_tworzenie_i_usuwanie_obiektów.singleton;

public class SingletonMethod {

    private static final SingletonMethod INSTANCE = new SingletonMethod();
    private SingletonMethod() {}

    public static SingletonMethod getInstance() {
        return INSTANCE;
    }
}
