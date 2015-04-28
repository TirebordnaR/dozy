//: generics/CompilerIntelligence.java
package com.dozy.learn.generics;

import java.util.*;

public class CompilerIntelligence {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<? extends Fruit> flist = Arrays.asList(new Apple());
        Apple a = (Apple) flist.get(0); // No warning
        flist.contains(new Apple()); // Argument is 'Object'
        flist.indexOf(new Apple()); // Argument is 'Object'
    }
} // /:~
