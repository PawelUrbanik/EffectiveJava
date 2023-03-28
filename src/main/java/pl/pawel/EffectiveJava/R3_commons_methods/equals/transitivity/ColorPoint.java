package pl.pawel.EffectiveJava.R3_commons_methods.equals.transitivity;

import java.awt.*;
import java.util.Objects;

public class ColorPoint extends Point{
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColorPoint)) return false;
        if (!super.equals(o)) return false;
        ColorPoint that = (ColorPoint) o;
        return Objects.equals(color, that.color);
    }

}
