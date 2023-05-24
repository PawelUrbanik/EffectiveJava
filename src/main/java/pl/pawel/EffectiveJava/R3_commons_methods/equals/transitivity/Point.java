package pl.pawel.EffectiveJava.R3_commons_methods.equals.transitivity;

import java.util.Objects;

public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if ( !( o instanceof Point)) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }
}
