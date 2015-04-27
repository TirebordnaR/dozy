//: generics/CuriouslyRecurringGeneric.java
package com.dozy.learn.generics;

class GenericType<T> {
}

public class CuriouslyRecurringGeneric extends
        GenericType<CuriouslyRecurringGeneric> {
} // /:~
