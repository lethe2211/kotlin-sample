package com.lethe2211.kotlinsample.java;

public class NullSafety {

    public void main() {
        String str = retString();
        int length = str.length(); // NPE
    }

    public String retString() {
        return null;
    }
}
