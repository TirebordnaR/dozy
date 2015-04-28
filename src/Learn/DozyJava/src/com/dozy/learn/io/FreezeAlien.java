//: io/FreezeAlien.java
package com.dozy.learn.io;

// Create a serialized output file.
import java.io.*;

public class FreezeAlien {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        ObjectOutput out = new ObjectOutputStream(
                new FileOutputStream("bin\\X.file"));
        Alien quellek = new Alien();
        out.writeObject(quellek);
    }
} // /:~
