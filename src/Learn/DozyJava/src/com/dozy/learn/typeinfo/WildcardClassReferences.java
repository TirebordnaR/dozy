//: typeinfo/WildcardClassReferences.java
package com.dozy.learn.typeinfo;

public class WildcardClassReferences {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
    }
} // /:~
