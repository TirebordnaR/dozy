//: initialization/MethodInit2.java
package com.dozy.learn.initialization;

public class MethodInit2 {
    int i = f();
    int j = g(i);

    int f() {
        return 11;
    }

    int g(int n) {
        return n * 10;
    }
} // /:~
