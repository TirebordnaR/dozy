//: concurrency/SerialNumberGenerator.java
package com.dozy.learn.concurrency;

public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;

    public static int nextSerialNumber() {
        return serialNumber++; // Not thread-safe
    }
} // /:~
