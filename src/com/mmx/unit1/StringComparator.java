package com.mmx.unit1;

public class StringComparator {
    public StringComparator() {}

    public StringComparator(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public void setStringA(String a) {
        this.a = a;
    }

    public void setStringB(String b) {
        this.b = b;
    }

    public boolean areEqual() {
        if(a.length() != b.length()) return false;

        for(int i = 0 ; i < a.length() ; i++) {
            if(a.charAt(i) != b.charAt(i)) return false;
        }

        return true;
    }

    private String a;
    private String b;
}
