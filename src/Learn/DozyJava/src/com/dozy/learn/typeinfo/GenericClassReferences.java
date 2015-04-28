//: typeinfo/GenericClassReferences.java
package com.dozy.learn.typeinfo;

public class GenericClassReferences {
    @SuppressWarnings({ "unused", "rawtypes" })
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class; // Same thing
        intClass = double.class;
        // genericIntClass = double.class; // Illegal
    }
} // /:~
