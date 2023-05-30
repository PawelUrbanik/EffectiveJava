package pl.pawel.EffectiveJava.R4.In_public_classes_use_accessor_methods;

public class NestedPoint {

    public static void main(String[] args) {
        Point point = new Point(1,2);
        System.out.println("Point X: "+ point.x);
        System.out.println("Point Y: "+ point.y);
    }

    /**
     * In private nested class it is ok to expose its data fields
     */
    private static class Point {

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int x,y;
    }
}
