//: generics/Manipulator3.java
package com.dozy.learn.generics;

class Manipulator3 {
    private HasF obj;

    public Manipulator3(HasF x) {
        obj = x;
    }

    public void manipulate() {
        obj.f();
    }
} // /:~
