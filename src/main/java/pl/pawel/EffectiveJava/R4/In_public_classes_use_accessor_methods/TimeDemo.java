package pl.pawel.EffectiveJava.R4.In_public_classes_use_accessor_methods;

public class TimeDemo {

    public static void main(String[] args) {
        Time time = new Time(20, 10);

        System.out.println("Hour: " + time.hour);
        System.out.println("Minute: " + time.minute);
    }
}
