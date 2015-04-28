//: access/IceCream.java
package com.dozy.learn.access;

// Demonstrates "private" keyword.

class Sundae {
    private Sundae() {
    }

    static Sundae makeASundae() {
        return new Sundae();
    }
}

public class IceCream {
    public static void main(String[] args) {
        // ! Sundae x = new Sundae();
        @SuppressWarnings("unused")
        Sundae x = Sundae.makeASundae();
    }
} // /:~
