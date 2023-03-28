package pl.pawel.EffectiveJava.R3_commons_methods.equals.transitivity;

import java.awt.*;
import java.util.Objects;

public class BetterColorPoint {
    private final Point point;
    private final Color color;

    public BetterColorPoint(int x, int y, Color color) {
        this.point = new Point(x,y);
        this.color = color;
    }

    /**
     * @return Point type on current color point
     */
    public Point asPoint() {
        return this.point;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BetterColorPoint)) return false;
        BetterColorPoint that = (BetterColorPoint) o;
        return Objects.equals(point, that.point) && Objects.equals(color, that.color);
    }
}
