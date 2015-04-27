//: generics/Manipulator2.java
package com.dozy.learn.generics;

class Manipulator2<T extends HasF> {
    private T obj;

    public Manipulator2(T x) {
        obj = x;
    }

    public void manipulate() {
        obj.f();
    }
} // /:~
