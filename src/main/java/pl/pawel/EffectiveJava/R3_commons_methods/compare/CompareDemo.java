package pl.pawel.EffectiveJava.R3_commons_methods.compare;

import java.util.Comparator;

public class CompareDemo {

    private static final Comparator<PhoneNumber> NEW_COMPARATOR = Comparator.comparingInt((PhoneNumber pn) -> pn.getLineNo())
            .thenComparingInt(pn -> pn.getPrefix())
            .thenComparingInt(pn -> pn.getAreaCode());

    public static void main(String[] args) {
        PhoneNumber phoneNumber1 = new PhoneNumber((short) 10, (short) 10, (short) 13);
        PhoneNumber phoneNumber2 = new PhoneNumber((short) 11, (short) 10, (short) 10);
        PhoneNumber phoneNumber3 = new PhoneNumber((short) 10, (short) 10, (short) 11);
        PhoneNumber phoneNumber4 = new PhoneNumber((short) 11, (short) 10, (short) 10);

        System.out.println("This should be <0(this is less than o1): result = " + phoneNumber1.compareTo(phoneNumber2));
        System.out.println("This should be <0(this is less than o1): result = " + phoneNumber1.compareTo(phoneNumber3));
        System.out.println("This should be 0(this is equal to o1): result = " + phoneNumber2.compareTo(phoneNumber4));

        System.out.println("Changing order of comparing!");
        System.out.println("This should be >0(this.lineNo > o1.lineNo)): result = " + NEW_COMPARATOR.compare(phoneNumber1, phoneNumber2));
        System.out.println("This should be <0(this.lineNo < o1.lineNo): result = " + NEW_COMPARATOR.compare(phoneNumber2, phoneNumber3));
        System.out.println("This should be 0(this is equal to o1): result = " + NEW_COMPARATOR.compare(phoneNumber2, phoneNumber4));

    }
}
