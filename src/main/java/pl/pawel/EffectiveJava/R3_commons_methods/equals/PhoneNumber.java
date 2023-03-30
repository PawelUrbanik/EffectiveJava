package pl.pawel.EffectiveJava.R3_commons_methods.equals;

public final class PhoneNumber {
    private final short areaCode, prefix, lineNo;

    public PhoneNumber(short areaCode, short prefix, short lineNo) {
        this.areaCode = rangeCheck(areaCode, 999, "areaCode");
        this.prefix = rangeCheck(prefix, 999, "prefix");
        this.lineNo = rangeCheck(lineNo, 9999, "line number");
    }

    private static short rangeCheck(int val, int max, String arg) {

        if (val < 0 || val > max) {
            throw new IllegalArgumentException(arg + ": " + val);
        }
        return (short) val;
    }

    @Override
    public boolean equals(Object o){
        if (o == this) return true;
        if (!(o instanceof PhoneNumber)) return false;
        PhoneNumber phoneNumber = (PhoneNumber) o;
        return phoneNumber.lineNo == lineNo &&
                phoneNumber.prefix == prefix &&
                phoneNumber.areaCode == areaCode;
    }
}
