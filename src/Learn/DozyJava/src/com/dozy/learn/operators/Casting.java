//: operators/Casting.java
package com.dozy.learn.operators;

public class Casting {
    public static void main(String[] args) {
        int i = 200;
        @SuppressWarnings("unused")
        long lng = (long) i;
        lng = i; // "Widening," so cast not really required
        long lng2 = (long) 200;
        lng2 = 200;
        // A "narrowing conversion":
        i = (int) lng2; // Cast required
    }
} ///:~
