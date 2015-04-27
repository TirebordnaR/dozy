//: polymorphism/shape/Triangle.java
package com.dozy.learn.polymorphism.shape;

import static net.mindview.util.Print.*;

public class Triangle extends Shape {
    public void draw() {
        print("Triangle.draw()");
    }

    public void erase() {
        print("Triangle.erase()");
    }
} // /:~
