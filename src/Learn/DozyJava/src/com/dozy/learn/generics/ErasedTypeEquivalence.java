//: generics/ErasedTypeEquivalence.java
package com.dozy.learn.generics;

import java.util.*;

public class ErasedTypeEquivalence {
    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        Class c1 = new ArrayList<String>().getClass();
        Class c2 = new ArrayList<Integer>().getClass();
        System.out.println(c1 == c2);
    }
} /*
   * Output: true
   */// :~
