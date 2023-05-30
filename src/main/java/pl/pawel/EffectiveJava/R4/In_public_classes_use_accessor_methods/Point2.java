package pl.pawel.EffectiveJava.R4.In_public_classes_use_accessor_methods;

/**
 * Added accessors to @{@link Point} class
 */
public class Point2 {
    private int x,y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
