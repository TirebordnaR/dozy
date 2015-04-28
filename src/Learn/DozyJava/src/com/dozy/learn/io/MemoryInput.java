//: io/MemoryInput.java
package com.dozy.learn.io;

import java.io.*;

public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(
                BufferedInputFile.read("src\\com\\dozy\\learn\\io\\MemoryInput.java"));
        int c;
        while ((c = in.read()) != -1)
            System.out.print((char) c);
    }
} /* (Execute to see output) */// :~
