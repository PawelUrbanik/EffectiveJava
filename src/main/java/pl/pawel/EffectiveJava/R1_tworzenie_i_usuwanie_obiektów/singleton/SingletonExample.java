package pl.pawel.EffectiveJava.R1_tworzenie_i_usuwanie_obiektów.singleton;

import java.util.function.Supplier;

public class SingletonExample {

    public static void main(String[] args) {
        SingletonAttribute attribute = SingletonAttribute.INSTANCE;
        SingletonAttribute attribute2 = SingletonAttribute.INSTANCE;
        System.out.println(attribute);
        System.out.println(attribute2);

        SingletonMethod method = SingletonMethod.getInstance();
        SingletonMethod method2 = SingletonMethod.getInstance();
        final Runnable supplier = SingletonMethod::getInstance;

        System.out.println(method);
        System.out.println(method2);

        SingletonEnum enumInstance = SingletonEnum.INSTANCE;
        System.out.println(enumInstance);
        SingletonEnum enumInstance2 = SingletonEnum.INSTANCE;
        System.out.println(enumInstance2);
    }
}
