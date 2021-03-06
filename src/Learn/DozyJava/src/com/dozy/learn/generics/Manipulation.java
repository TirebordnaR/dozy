//: generics/Manipulation.java
package com.dozy.learn.generics;

// {CompileTimeError} (Won't compile)

class Manipulator<T> {
    @SuppressWarnings("unused")
    private T obj;

    public Manipulator(T x) {
        obj = x;
    }

    // Error: cannot find symbol: method f():
    public void manipulate() {
        // err obj.f();
    }
}

public class Manipulation {
    public static void main(String[] args) {
        HasF hf = new HasF();
        Manipulator<HasF> manipulator = new Manipulator<HasF>(hf);
        manipulator.manipulate();
    }
} // /:~
