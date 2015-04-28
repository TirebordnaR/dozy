//: access/QualifiedMyClass.java
package com.dozy.learn.access;

public class QualifiedMyClass {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        com.dozy.learn.access.mypackage.MyClass m = new com.dozy.learn.access.mypackage.MyClass();
    }
} // /:~
