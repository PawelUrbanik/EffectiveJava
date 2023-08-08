package pl.pawel.EffectiveJava.R4.minimize_mutability;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Immutable class - all constructors are private and added one static factory
 */
public class Complex2 {
    private final double re;
    private final double im;

    private Complex2(double re, double im) {
        this.re = re;
        this.im = im;
    }

}
