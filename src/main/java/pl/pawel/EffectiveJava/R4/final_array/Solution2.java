package pl.pawel.EffectiveJava.R4.final_array;

import pl.pawel.EffectiveJava.R3_commons_methods.equals.transitivity.Point;

public class Solution2 {

    private static final Point[] PRIVATE_VALUES = {
            new Point(1,2)
    };

    /**
     *
     * @return Cloned array
     */
    public static final Point[] values() {
        return PRIVATE_VALUES.clone();
    }
}
