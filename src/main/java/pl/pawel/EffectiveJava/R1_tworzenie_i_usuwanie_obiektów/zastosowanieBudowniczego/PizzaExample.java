package pl.pawel.EffectiveJava.R1_tworzenie_i_usuwanie_obiektów.zastosowanieBudowniczego;

public class PizzaExample {

    public static void main(String[] args) {
        NYPizza nyPizza = new NYPizza.Builder(NYPizza.Size.MEDIUM)
                .addTopping(Pizza.Topping.SASUAGE)
                .addTopping(Pizza.Topping.HAM)
                .build();

        CalzonePizza calzonePizza = new CalzonePizza.Builder()
                .addTopping(Pizza.Topping.ONION)
                .sauceInside()
                .build();
        System.out.println(nyPizza);
        System.out.println(calzonePizza);
    }
}
