//: initialization/OverloadingVarargs2.java
package com.dozy.learn.initialization;

// {CompileTimeError} (Won't compile)

public class OverloadingVarargs2 {
    static void f(float i, char... args) {
        System.out.println("first");
    }

    static void f(char... args) {
        System.out.print("second");
    }

    public static void main(String[] args) {
        f(1, 'a');
        f('a', 'b');
    }
} // /:~
