//: generics/Erased.java
package com.dozy.learn.generics;

// {CompileTimeError} (Won't compile)

public class Erased<T> {
    @SuppressWarnings("unused")
    private final int SIZE = 100;

    public static void f(Object arg) {
/*        if (arg instanceof T) {
        } // Error
        T var = new T(); // Error
        T[] array = new T[SIZE]; // Error
        T[] array = (T) new Object[SIZE]; // Unchecked warning
*/    }
} // /:~
