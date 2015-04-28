//: access/SingleImport.java
package com.dozy.learn.access;

import java.util.ArrayList;

public class SingleImport {
    public static void main(String[] args) {
        @SuppressWarnings({ "unused", "rawtypes" })
        ArrayList list = new java.util.ArrayList();
    }
} // /:~
