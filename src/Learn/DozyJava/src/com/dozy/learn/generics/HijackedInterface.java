//: generics/HijackedInterface.java
package com.dozy.learn.generics;

// {CompileTimeError} (Won't compile)

class Cat extends ComparablePet implements Comparable<Cat> {
    // Error: Comparable cannot be inherited with
    // different arguments: <Cat> and <Pet>
    public int compareTo(Cat arg) {
        return 0;
    }
} // /:~
