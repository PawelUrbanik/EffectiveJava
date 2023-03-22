package pl.pawel.EffectiveJava.R1_tworzenie_i_usuwanie_obiektów.zastosowanieBudowniczego;

public class NutricionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        //required
        private final int servingSize;
        private final int servings;

        //optional
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int value) {
            calories = value;
            return this;
        }

        public Builder fat(int value) {
            fat = value;
            return this;
        }

        public Builder sodium(int value) {
            sodium = value;
            return this;
        }

        public Builder carbohydrate(int value) {
            carbohydrate = value;
            return this;
        }

        public NutricionFacts build() {
            return new NutricionFacts(this);
        }

    }

    private NutricionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    @Override
    public String toString() {
        return "NutricionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}
