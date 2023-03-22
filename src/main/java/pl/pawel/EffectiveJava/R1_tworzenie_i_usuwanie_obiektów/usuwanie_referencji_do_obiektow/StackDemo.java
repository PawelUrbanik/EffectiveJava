package pl.pawel.EffectiveJava.R1_tworzenie_i_usuwanie_obiektów.usuwanie_referencji_do_obiektow;

import java.util.EmptyStackException;

public class StackDemo {

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.push("Pawel");
        stack.push("Pawel2");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        try {
            System.out.println(stack.pop());
        } catch (EmptyStackException e) {
            System.out.println("EMPTY STACK");
        }
    }
}
