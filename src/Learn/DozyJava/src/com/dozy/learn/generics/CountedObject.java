//: generics/CountedObject.java
package com.dozy.learn.generics;

public class CountedObject {
    private static long counter = 0;
    private final long id = counter++;

    public long id() {
        return id;
    }

    public String toString() {
        return "CountedObject " + id;
    }
} // /:~
