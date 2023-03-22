package pl.pawel.EffectiveJava.R1_tworzenie_i_usuwanie_obiektów.unikanie_finalizatorow;

import java.lang.ref.Cleaner;

public class Room implements AutoCloseable {
    private static final Cleaner CLEANER = Cleaner.create();

    private static class State implements Runnable {
        int numJunkPiles; //liczba śmieci
        State(int numJunkPiles) {
            this.numJunkPiles = numJunkPiles;
        }

        @Override
        public void run() {
            System.out.println("Czyszczenie pokoju");
            numJunkPiles = 0;
        }
    }

    //Stan pokoju
    private final State state;
    //Obiekt czyszczący pokój
    private final Cleaner.Cleanable cleanable;
    public Room(int numJunkPiles) {
        state = new State(numJunkPiles);
        cleanable = CLEANER.register(this, state);
    }

    @Override
    public void close() throws Exception {
        cleanable.clean();
    }
}
