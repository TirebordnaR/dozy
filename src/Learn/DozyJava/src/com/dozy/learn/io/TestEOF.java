//: io/TestEOF.java
package com.dozy.learn.io;

// Testing for end of file while reading a byte at a time.
import java.io.*;

public class TestEOF {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(
                new FileInputStream("src\\com\\dozy\\learn\\io\\TestEOF.java")));
        while (in.available() != 0)
            System.out.print((char) in.readByte());
    }
} /* (Execute to see output) */// :~
