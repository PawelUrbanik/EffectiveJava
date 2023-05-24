package pl.pawel.EffectiveJava.R3_commons_methods.compare;

import java.util.Comparator;
import java.util.Objects;

public final class PhoneNumber implements Comparable<PhoneNumber>{
    private short areaCode, prefix, lineNo;

    public void setPrefix(short prefix) {
        this.prefix = prefix;
    }

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

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, prefix, lineNo);
    }


    /**
     * Returns the string representation of this phone number.
     * The string consists of twelve characters whose format is
     * "XXX-YYY-ZZZZ", where XXX is the area code, YYY is the
     * prefix, and ZZZZ is the line number. Each of the capital
     * letters represents a single decimal digit.
     **
     If any of the three parts of this phone number is too small
     * to fill up its field, the field is padded with leading zeros.
     * For example, if the value of the line number is 123, the last
     * four characters of the string representation will be "0123".
     */
    @Override
    public String toString() {
        return String.format("%03d-%03d-%04d", areaCode, prefix, lineNo);
    }

    /**
     * Default order 1. AreaCode  2. Prefix  3. LineNo
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(PhoneNumber o) {
        int result = Short.compare(this.areaCode, o.areaCode);
        if (result == 0) {
            result = Short.compare(this.prefix, o.prefix);
        }
        if (result == 0) {
            result = Short.compare(this.lineNo, o.lineNo);
        }
        return result;
    }

    public short getAreaCode() {
        return areaCode;
    }

    public short getPrefix() {
        return prefix;
    }

    public short getLineNo() {
        return lineNo;
    }
}
