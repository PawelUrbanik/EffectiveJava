package pl.pawel.EffectiveJava.R4.minimize_mutability;

import java.util.Objects;

public final class Complex {

    public static final Complex ZERO = new Complex(0,0);
    public static final Complex ONE = new Complex(1,0);
    public static final Complex I = new Complex(0,1);

    private final float re;
    private final float im;

    public Complex(float re, float im) {
        this.re = re;
        this.im = im;
    }

    //Getters without setters
    public float getRe() { return re; }
    public float getIm() { return im; }

    public Complex plus(Complex complex) {
        return new Complex(re + complex.re, im + complex.im);
    }

    public Complex minus(Complex complex) {
        return new Complex(re - complex.re, im - complex.im);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return Float.compare(complex.re, re) == 0 && Float.compare(complex.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }
}
