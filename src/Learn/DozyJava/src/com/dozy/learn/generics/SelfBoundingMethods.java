//: generics/SelfBoundingMethods.java
package com.dozy.learn.generics;

public class SelfBoundingMethods {
    static <T extends SelfBounded<T>> T f(T arg) {
        return arg.set(arg).get();
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        A a = f(new A());
    }
} // /:~
