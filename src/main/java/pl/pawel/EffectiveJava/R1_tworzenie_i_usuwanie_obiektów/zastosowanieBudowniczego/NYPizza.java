package pl.pawel.EffectiveJava.R1_tworzenie_i_usuwanie_obiektów.zastosowanieBudowniczego;

import java.util.Objects;

public class NYPizza extends Pizza{
    public enum Size {SMALL, MEDIUM,  LARGE}
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }
        @Override
        NYPizza build() {
            return new NYPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }


    public NYPizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }

    @Override
    public String toString() {
        return "NYPizza{" +
                "size=" + size +
                ", toppings=" + toppings +
                '}';
    }
}
