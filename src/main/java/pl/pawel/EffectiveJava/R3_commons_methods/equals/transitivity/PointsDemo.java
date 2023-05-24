package pl.pawel.EffectiveJava.R3_commons_methods.equals.transitivity;

import java.awt.*;

public class PointsDemo {

    public static void main(String[] args) {

        Point p1 = new Point(1,2);
        ColorPoint colorPoint = new ColorPoint(1,2, Color.BLUE);
        BetterColorPoint bcp = new BetterColorPoint(1,2, Color.BLACK);

        /**
         *  violates the rule of transitivity
         */

        System.out.println(p1.equals(colorPoint));
        System.out.println(colorPoint.equals(p1));

        System.out.println(p1.equals(bcp.asPoint()));
        System.out.println(bcp.asPoint().equals(p1));
    }
}
