package pl.pawel.EffectiveJava.R4.final_array;

import pl.pawel.EffectiveJava.R3_commons_methods.equals.transitivity.Point;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution1 {

    private static final Point[] PRIVATE_VALUES = { new Point(1,2)};

    //One of the solution is to return unmodifiable List of elements from array
    public static final List<Point> VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));
}
