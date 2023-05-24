package pl.pawel.EffectiveJava.R4.final_array;

import pl.pawel.EffectiveJava.R3_commons_methods.equals.transitivity.Point;

import java.util.List;

public class NonZeroArrayDemo {

    public static void main(String[] args) {

        System.out.println("Point 0 in array before change: " + PublicStaticArray.VALUES[0]);
        //Potential security hole
        //non-zero array is always mutables
        PublicStaticArray.VALUES[0] = new Point(10,10);
        System.out.println("Point 0 in array after change: " + PublicStaticArray.VALUES[0]);


        /**
         * Solution 1
         * Returning unmodifiable List
         */
        System.out.println("Point 0 in array before change: " + Solution1.VALUES.get(0));
        final List<Point> values = Solution1.VALUES;
        //values.add(1, new Point(10,32)); Not allowed. List is unmodifiable
        //Operation returns the same value
        System.out.println("Point 0 in array after change: " + Solution1.VALUES.get(0));


        /**
         * Solution 2
         * Returning cloned array
         */
        System.out.println("Point 0 in array before change: " + Solution2.values()[0]);
        final Point[] values1 = Solution2.values();
        // The value is changed only on cloned array
        values1[0] =new Point(100, 100);
        //Operation returns the same value
        System.out.println("Point 0 in array after change: " + Solution2.values()[0]);



    }
}
