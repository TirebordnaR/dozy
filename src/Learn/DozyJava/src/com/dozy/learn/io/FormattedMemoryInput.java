//: io/FormattedMemoryInput.java
package com.dozy.learn.io;

import java.io.*;

public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        try {
            DataInputStream in = new DataInputStream(new ByteArrayInputStream(
                    BufferedInputFile.read("src\\com\\dozy\\learn\\io\\FormattedMemoryInput.java")
                            .getBytes()));
            while (true)
                System.out.print((char) in.readByte());
        } catch (EOFException e) {
            System.err.println("End of stream");
        }
    }
} /* (Execute to see output) */// :~
