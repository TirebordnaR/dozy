//: exceptions/ExceptionSilencer.java
package com.dozy.learn.exceptions;

public class ExceptionSilencer {
    @SuppressWarnings("finally")
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            // Using 'return' inside the finally block
            // will silence any thrown exception.
            return;
        }
    }
} // /:~
