package pl.pawel.EffectiveJava.R3_commons_methods.equals;

public class PhoneNumberDemo {

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber((short) 777, (short) 558, (short) 4554);
        PhoneNumber phoneNumber2 = new PhoneNumber((short) 777, (short) 558, (short) 4554);
        PhoneNumber phoneNumber3 = new PhoneNumber((short) 222, (short) 223, (short) 321);
        PhoneNumber phoneNumber4 = new PhoneNumber((short) 777, (short) 558, (short) 4554);


        System.out.println("Should be true:");
        System.out.println(phoneNumber.equals(phoneNumber2));
        System.out.println(phoneNumber4.equals(phoneNumber2));
        System.out.println(phoneNumber.equals(phoneNumber4));

        System.out.println("shoulde be false:");
        System.out.println(phoneNumber.equals(phoneNumber3));


        phoneNumber2 = phoneNumber3;
        System.out.println("Changed reference: ");
        System.out.println(phoneNumber.equals(phoneNumber2));
        System.out.println(phoneNumber2.equals(phoneNumber3));
        System.out.println(phoneNumber.equals(phoneNumber));


    }
}
