package pl.pawel.EffectiveJava.R3_commons_methods.equals;

public final class CaseInsensitiveString {

    private String s;

    public CaseInsensitiveString(String s) {
        if (s == null) throw new NullPointerException();
        this.s = s;
    }

    /**
     * Bad implementation of equals method
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof CaseInsensitiveString)
            return s.equalsIgnoreCase(((CaseInsensitiveString) obj).s);
        if (obj instanceof String)
            return s.equalsIgnoreCase((String) obj);
        return false;
    }
}
