package pl.pawel.EffectiveJava.R3_commons_methods.equals;

public class PhoneNumberDemo {

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber((short) 777, (short) 558, (short) 4554);
        PhoneNumber phoneNumber2 = new PhoneNumber((short) 777, (short) 558, (short) 4554);
        PhoneNumber phoneNumber3 = new PhoneNumber((short) 222, (short) 223, (short) 321);
        PhoneNumber phoneNumber4 = new PhoneNumber((short) 777, (short) 558, (short) 4554);


        System.out.println("Should be true:");
        System.out.println(phoneNumber.equals(phoneNumber2));
        System.out.println("HashCode should be the same: " + phoneNumber.hashCode() + " pn2: " + phoneNumber2.hashCode());
        System.out.println(phoneNumber4.equals(phoneNumber2));
        System.out.println("HashCode should be the same: " + phoneNumber4.hashCode() + " pn2: " + phoneNumber2.hashCode());
        System.out.println(phoneNumber.equals(phoneNumber4));
        System.out.println("HashCode should be the same: " + phoneNumber.hashCode() + " pn2: " + phoneNumber4.hashCode());


        System.out.println("shoulde be false:");
        System.out.println(phoneNumber.equals(phoneNumber3));
        System.out.println("And hashcode should be different: " + phoneNumber.hashCode() + " pn3: " + phoneNumber3.hashCode());


        phoneNumber2 = phoneNumber3;
        System.out.println("Changed reference: ");
        System.out.println(phoneNumber.equals(phoneNumber2));
        System.out.println(phoneNumber2.equals(phoneNumber3));
        System.out.println(phoneNumber.equals(phoneNumber));

        System.out.println("Testing changing field in object");
        System.out.println("Phone number hashCode before changing: " + phoneNumber.hashCode());
        phoneNumber.setPrefix((short) 21);
        System.out.println("Phone number hashCode after changing: " + phoneNumber.hashCode());

        System.out.println(phoneNumber);
        System.out.println(phoneNumber2);

    }
}
