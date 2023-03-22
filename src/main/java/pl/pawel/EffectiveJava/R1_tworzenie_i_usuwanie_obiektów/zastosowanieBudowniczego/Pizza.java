package pl.pawel.EffectiveJava.R1_tworzenie_i_usuwanie_obiektów.zastosowanieBudowniczego;

import java.util.EnumSet;
import java.util.Set;

public abstract class Pizza {

    public enum Topping {HAM, MUSHROM, ONION, SASUAGE}

    ;
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(topping);
            return self();
        }

        abstract Pizza build();

        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }

}
