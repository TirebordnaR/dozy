//: typeinfo/BoundedClassReferences.java
package com.dozy.learn.typeinfo;

public class BoundedClassReferences {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Class<? extends Number> bounded = int.class;
        bounded = double.class;
        bounded = Number.class;
        // Or anything else derived from Number.
    }
} // /:~
